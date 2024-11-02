#include <stdio.h>

int main()
{

    int a,b,result;

    printf("Enter a value : ");
    scanf("%d",&a);

    printf("Enter b value : ");
    scanf("%d",&b);

    result = (a+b) * (a+b);
    printf("The result is %d\n",result);

    return 0;
}
