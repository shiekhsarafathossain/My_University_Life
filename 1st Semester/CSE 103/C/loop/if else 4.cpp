#include <stdio.h>

int main()
{
    int value1, value2, value3, max;

    printf("Enter First Value : ");
    scanf("%d", &value1);

    printf("Enter Second Value : ");
    scanf("%d", &value2);

    printf("Enter Third Value : ");
    scanf("%d", &value3);

    if (value1 > value2)

    {
        max = value1;
    }

    else
    {
        max = value2;
    }

    if (value3 > max)
    {
        max = value3;
    }

    printf("Maximum value is : %d \n", max);

    return 0;
}
