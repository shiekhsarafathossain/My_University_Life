#include "stdio.h"

int main()

{
    float area,perimeter,a,b;

    printf("Enter two value : ");
    scanf("%f %f",&a,&b);

    area = a*b;
    printf("Area is %f",area);

    perimeter = 2*(a+b);
    printf("Perimeter is %f",perimeter);

    return 0;
}
