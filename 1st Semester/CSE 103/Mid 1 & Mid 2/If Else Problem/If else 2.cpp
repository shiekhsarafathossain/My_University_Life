#include "stdio.h"

int main()
{

    int num;

    printf("enter a number : ");
    scanf("%d", &num);

    if(num%2 == 0)
    {
        printf("The Value is Even");
    }

    else
        printf("The value is Odd");

    return 0;
}
