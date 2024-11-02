#include <stdio.h>

int main()
{

    int i,n,multi;

    printf("Enter a whole number : ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        multi = i*n;
        printf("%d X %d = %d\n",i,n,multi);
    }

    return 0;
}
