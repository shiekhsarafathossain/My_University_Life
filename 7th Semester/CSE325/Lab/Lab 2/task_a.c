#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    pid_t pid;
    int i;

    printf("Parent process started. Creating 5 child processes...\n");

    for (i = 0; i < 5; i++) {
        pid = fork();

        if (pid == -1) {
            perror("fork failed");
            exit(1);
        }

        if (pid == 0) {
            printf("Child %d: My PID is %d, Parent PID is %d\n", i + 1, getpid(), getppid());
            exit(0);
        }
    }

    printf("Parent process is now in an infinite loop. Child processes should be zombies.\n");
    while(1);

    return 0;
}

