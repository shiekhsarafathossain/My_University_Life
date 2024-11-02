#include <stdio.h>

int my_square(int a)
{
    int r;

    r = a*a;

    return r;
}

int my_cube(int b)
{
    int i;

    i = b*b*b;

    return i;
}

int main()
{
    int num;

    printf("Enter an integer number : ");
    scanf("%d",&num);

    printf("Square = %d \n",my_square(num));
    printf("Cube = %d \n",my_cube(num));

}
