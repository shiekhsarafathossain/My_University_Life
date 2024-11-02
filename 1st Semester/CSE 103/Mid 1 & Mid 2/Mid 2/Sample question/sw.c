#include <stdio.h>

int main()
{
    float num1,num2,total;
    char op;

    scanf("%f %c %f",&num1,&op,&num2);

    switch(op)
    {
    case '+':
        total = num1 + num2;
        break;

     case '-':
        total = num1 - num2;
        break;

    case '*':
        total = num1 * num2;
        break;

    case '/':
        total = num1 / num2;
        break;

    default:
        printf("Invalid Operator");
    }
    printf("%.1f %c %.1f = %.2f",num1,op,num2,total);
}
