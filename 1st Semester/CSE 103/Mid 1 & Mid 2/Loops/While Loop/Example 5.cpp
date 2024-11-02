#include "stdio.h"

int main()

{
    int base,power,i,result;

    printf("Enter a Value : ");
    scanf("%d %d",&base,&power);

    i=1;
    result=1;

    while(i<=power)
    {
        result = result*base;
        i++;
    }
    printf("%d\n",result);
}

