#include "stdio.h"

int main()

{

    int year;

    printf("Enter years we will check if its leap year or not : ");
    scanf("%d",&year);

    if ( ((year%4 == 0) && (year%100 !=0)) || (year%400 == 0) )

        {
            printf("%d is Leap Year",year);
        }

    else
    {
            printf("%d is not Leap Year",year);
    }

    return 0;

}
