#include "stdio.h"

int main()

{

    int number;

    printf("Enter a number : ");
    scanf("%d", &number);

    if(number > 0)
    {
        printf("You Entered a positive number");
    }

    else if (number < 0)
    {
        printf("You entered a negative number");
    }

    else
    {
        printf("you entered zero");
    }

    return 0;

}
