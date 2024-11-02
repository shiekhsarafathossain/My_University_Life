#include <stdio.h>

int main()

{
    int term,interval,n,sum;

    printf("Enter the value of N : ");
    scanf("%d",&n);


    for(term=4,interval=3;term<=n;term+=interval)
    {
        if(term==4)
        {
            printf("4");
        }

        else if(term <= n)
        {
            printf(" + (%d + %d)",term,interval);
        }
    }
}
