#include <stdio.h>
#include <stdlib.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <unistd.h>
#include <wait.h>

void *incrementFunction(int *shared);
void *decrementFunction(int *shared);

int main() {
    // Step 2.1: Create shared memory
    key_t key = ftok("shmfile", 65); // Generate a unique key
    int shmid = shmget(key, sizeof(int), 0666 | IPC_CREAT); // Create shared memory segment
    if (shmid == -1) {
        perror("shmget failed");
        return 1;
    }

    // Step 2.2: Attach to shared memory
    int *shared = (int *)shmat(shmid, NULL, 0); // Attach shared memory to the process
    if (shared == (int *)-1) {
        perror("shmat failed");
        return 1;
    }

    // Step 2.3: Initialize shared memory variable
    *shared = 1;

    // Step 2.4: Create two processes using fork
    pid_t pid1 = fork(); // Create the first process (process1)
    if (pid1 == 0) {
        // Child process 1 executes incrementFunction
        incrementFunction(shared);
        exit(0);
    }
    
    pid_t pid2 = fork(); // Create the second process (process2)
    if (pid2 == 0) {
        // Child process 2 executes decrementFunction
        decrementFunction(shared);
        exit(0);
    }

    // Step 2.5: Wait for both processes to finish
    wait(NULL);
    wait(NULL);

    // Step 2.6: Print final value of shared variable
    printf("Final value of shared is %d\n", *shared);

    // Step 2.7: Detach from shared memory
    shmdt(shared);

    // Step 2.8: Remove shared memory
    shmctl(shmid, IPC_RMID, NULL);
    
    return 0;
}

void *incrementFunction(int *shared) {
    int x;
    x = *shared; // process 1 reads the value of shared variable
    printf("Process1 reads the value of shared variable as %d\n", x);
    sleep(1); // process 1 sleeps for 1 second
    x++; // process 1 increments its value
    printf("Local updation by Process1: %d\n", x);
    sleep(1); // process 1 sleeps again to simulate context switching
    *shared = x; // process 1 updates the value of shared variable
    printf("Value of shared variable updated by Process1 is: %d\n", *shared);
}

void *decrementFunction(int *shared) {
    int y;
    y = *shared; // process 2 reads the value of shared variable
    printf("Process2 reads the value of shared variable as %d\n", y);
    sleep(1); // process 2 sleeps for 1 second
    y--; // process 2 decrements its value
    printf("Local updation by Process2: %d\n", y);
    sleep(1); // process 2 sleeps again to simulate context switching
    *shared = y; // process 2 updates the value of shared variable
    printf("Value of shared variable updated by Process2 is: %d\n", *shared);
}
