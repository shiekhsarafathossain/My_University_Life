#include "stdio.h"

int main ()
{
    int discount,qty,rate,total;

    printf("Enter quantity & rate : ");
    scanf("%d %d", &qty, &rate);

    if (qty > 1000)
    {
        discount = 10;
    }

    else
    {
        discount = 0;
    }

    total = qty*rate-qty*rate*discount/100;

    printf("Total Expenses : %d",total);



        return 0;

}
