#include "stdio.h"

int main()
{

    int qty,dis;
    float rate,tot;

    dis = 0;

    printf("Enter Quantity and Rate : ");
    scanf("%d %f",&qty,&rate);

    if(qty>1000)
    {
        dis = 10;
    }

    tot = (qty*rate) - (qty*rate*dis/100);

    printf("Total expense = %f",tot);

    return 0;
}
