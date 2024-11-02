#include "stdio.h"

int main()
{

	float value;

	scanf("%f", &value);

	if(value == 0)
    {
        printf("It is a Zero");
    }

    if(value>0)
    {
        printf("It is a positive number");
    }

    if(value<0)
    {
        printf("It is a negative number");
    }

	return 0;
}
