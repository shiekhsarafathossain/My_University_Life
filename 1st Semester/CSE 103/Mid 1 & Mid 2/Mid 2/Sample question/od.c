/*

Write a C program to find the value of the following series. You need to use for loop for your solution.
4 + 7 + 10 + 13 + … + N
Hint: Try to find the intervals between the two consecutive terms. The above series can be written like
the following:
4 + (4+3) + (7+3) + (10+3) + … + N

*/

#include <stdio.h>

int main()
{
    int i,j,sum,n;

    printf("Enter the value of N : ");
    scanf("%d",&n);


    for(i=4,j=3,sum=0;i<=n;i+=j)
    {
        sum += i;

        if(i==4)
        {
            printf("4");
        }

        else if(i==n)
        {
            printf("%d",i);
        }

        else if (i<n)
        {
            printf(" + %d",i);
        }
    }
    printf(" = %d",sum);
}
