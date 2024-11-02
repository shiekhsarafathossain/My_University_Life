#include <stdio.h>

int main()
    {
    int x=10,y;

    y = x++;
    printf("The value of X = %d and Value of Y = %d\n",x,y);
    //x = 11 y = 11


    y = ++x;
    printf("The value of X = %d and Value of Y = %d\n",x,y);
    //x = 12 y = 11

    y = x--;
    printf("The value of X = %d and Value of Y = %d\n",x,y);
    //x = 11 y = 10

    y = --x;
    printf("The value of X = %d and Value of Y = %d\n",x,y);
    //x = 10 y = 10

    return 0;
}
