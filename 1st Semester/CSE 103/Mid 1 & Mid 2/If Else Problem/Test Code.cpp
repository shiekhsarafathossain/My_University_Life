#include "stdio.h"

int main()

{
    int b,e,i,result;

    printf("Enter a Value : ");
    scanf("%d %d",&b,&e);

    i = 1;
    result = 1;
    while(i<=e)
    {
        result *= b;
        i++ ;

    }
    printf("%d\n",result);
}
