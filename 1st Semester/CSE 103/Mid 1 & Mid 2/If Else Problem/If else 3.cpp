#include "stdio.h"

int main()
{

    float bs,ha,ma,gs;

    printf("Enter Basic Salary : ");
    scanf("%f",&bs);

    if(bs < 30000)
    {
        ha = 20;
        ma = 10;
    }

    if(bs >= 30000)
    {
        ha = 25;
        ma = 15;
    }

    gs = bs + (bs*ha/100) + (bs*ma/100);

    printf("The gross salary is %f",gs);


    return 0;
}
