//1. Write a function named swap that will take addresses of two integer type
//variables and exchange the values in those variables. Write main() function so
//that it calls the swap() function properly and shows appropriate output.

#include <stdio.h>

    int main()
    {
            int a=10,b=20;
          int *p1,*p2,*temp;


        p1=a;
        p2=b;
        *temp = *p1;
        *p1 = *p2;
        *p2 = *temp;
        printf("Swpped number is %u and %x",p1,p2);
    }


