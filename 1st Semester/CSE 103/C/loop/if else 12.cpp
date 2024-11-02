#include "stdio.h"

int main()

{
    int val1,val2,val3,sum;

    printf("Enter Three Angles : ");
    scanf("%d %d %d",&val1,&val2,&val3);


    if (val1+val2+val3 == 180)
    {
        printf("The Triangles is Valid");
    }

    else
        printf("Triangle is not  valid");
}
