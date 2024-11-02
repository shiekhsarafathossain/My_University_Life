#include <stdio.h>

int main()

{
    float a,area,perimeter;

    printf("Enter a value");
    scanf("%f",&a);

    area = 3.14*a*a;
    perimeter = 2*3.14*a;

    printf("Area of circle is %f\nPerimeter of circle is %f",area,perimeter);

    return 0;
}
