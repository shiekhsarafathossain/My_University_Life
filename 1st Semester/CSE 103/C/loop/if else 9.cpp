#include "stdio.h"

int main()

{
    float input1,input2,result;
    char sign;

    printf("Which operation you like to perform?\n");
	printf("\tPress + sign for addition\n\tPress - sign for subtraction\n\tPress * sign for multiplication\n\tPress / sign for division\n");
	scanf("%c", &sign);

	printf ("Enter two numbers: ");
	scanf ("%f %f",&input1,&input2);

	if (sign == '+')
	{
	    printf("You have chosen additional operator");
        result = input1+input2;
        printf("The result is %f\n",result);
	}

	else if (sign == '-')
    {
        printf("you have chosen subtraction operator");
        result = input1-input2;
        printf("the result is %f\n",result);
    }

    else if (sign == '*')
    {
        printf("you have chosen multiplication operator");
        result = input1*input2;
        printf("the result is %f\n",result);
    }

    else if (sign == '/')
    {
        printf("you have chosen division operator");
        result = input1/input2;
        printf("the result is %f\n", result);
    }

    else
        printf("you have chose wrong operator");

    return 0;
}
