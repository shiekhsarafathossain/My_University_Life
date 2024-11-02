#include <stdio.h>

void main()
{

    int i;

    for(i=0;i<20;i+=5)
        {
        if((i%10)==0)
            i=i+4;

        else
            i=i-(i%5);

        printf("%d",i);
        }
}
