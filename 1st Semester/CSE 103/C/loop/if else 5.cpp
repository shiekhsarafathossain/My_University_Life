#include "stdio.h"


    int main()
{

    int value1,value2,value3,min;

    printf("Enter first value : ");
    scanf("%d",&value1);

    printf("Enter second value : ");
    scanf("%d",&value2);

    printf("Enter third value : ");
    scanf("%d",&value3);

    if (value1 < value2)
    {
        min = value1;
    }

    else
    {
        min = value2;
    }

    if (value3 < min)
    {
        min = value3;
    }

    printf("Minimum Value is %d \n",min);




    return 0;

}
