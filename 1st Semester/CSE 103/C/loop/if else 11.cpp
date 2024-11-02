#include "stdio.h"

int main()
{

    int number,num2;

    printf("Enter a value : ");
    scanf("%d", &number);

    if (number <= 0)
    {
      number *=(-1);
      printf("Absolute value = %d",number);
    }
    else

    printf("Absolute value = %d",number);

    return 0;
}
