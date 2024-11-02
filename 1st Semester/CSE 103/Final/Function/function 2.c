#include<stdio.h>

int cal_sum(int a, int b, int c)
{
    int s;
    s = a+b+c;

    return s;
}

int main()
{
    int num1,num2,num3,sum;

    printf("Enter three number: ");
    scanf("%d %d %d",&num1,&num2,&num3);
    sum = cal_sum(num1,num2,num3);
    printf("Sum = %d",sum);

    return 0;
}
