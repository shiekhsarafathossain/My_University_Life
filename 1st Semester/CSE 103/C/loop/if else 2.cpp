#include <stdio.h>

    int main()
{

    int num;

    printf("Enter a Integer Value : ");
    scanf("%d", &num);

    if (num%2 == 0)
    {
        printf("value %d is even",num);
    }

    else
    {
        printf("value %d is odd", num);
    }

    return 0;

}
