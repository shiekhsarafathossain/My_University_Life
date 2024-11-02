#include "stdio.h"

int main()
{

	float value;

	scanf("%f", &value);

	if(value > 0)
    {
        printf("It is a positive number");
    }

    else if(value == 0)
    {
        printf("It is a Zero");
    }

    else
    {
        printf("It is a negative number");
    }

	return 0;
}
