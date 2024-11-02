#include "stdio.h"

int main()
{

    int i=1,fact;

    printf("Enter a value : ");
    scanf("%d",&fact);

    while(fact>=1)
    {
        i *= fact;
        fact--;
    }
    printf("Factorial of %d is %d",fact,i);
}
