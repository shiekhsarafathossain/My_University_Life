/* zombie test. */
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    pid_t pid;
    switch (pid = fork())
    {
    case -1:
        perror("fork failed");
        exit(1);
    case 0:
        printf("CHILD: My PID is %d, My parent's PID is %d\n", getpid(), getppid());
        exit(0);
    default:
        printf("PARENT: My PID is %d, My child's PID is %d\n", getpid(), pid);
        printf("PARENT: I'm now looping...\n");
        while (1)
            ;
    }
    exit(0);
}
