#include "stdio.h"

int main()
{
    int h,b,hy;

    scanf("%d %d %d",&h,&b,&hy);

    if((hy*hy == h*h + b*b)&&(h/b == 45))
        printf("triangle is right angel.");

    else
        printf("triangle is not right angel.");
}
