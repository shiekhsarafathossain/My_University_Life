#include <stdio.h>

int main()
{
    int n,r;

    printf("Enter number : ");
    scanf("%d",&n);

    do
    {
        r = n%10;
        n = n/10;
        printf("%d",r);

    }while(n>0);

    return 0;
}
