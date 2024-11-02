#include <stdio.h>

int main()
{
    int i=1,j,n;

    printf("Enter a number : ");
    scanf("%d",&n);


    do
    {
        j = n%10;
        i = i*j;
        n = n/10;

    }while(n!=0);
    printf("Product = %d",i);
    return 0;
}
