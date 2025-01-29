#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>

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

    for (i = 0; i < 5; i++) {
        pid_t child_pid = waitpid(-1, NULL, 0);
        if (child_pid > 0) {
            printf("Parent: Reaped child with PID %d\n", child_pid);
        }
    }

    printf("Parent process has reaped all children. Exiting...\n");
    return 0;
}

