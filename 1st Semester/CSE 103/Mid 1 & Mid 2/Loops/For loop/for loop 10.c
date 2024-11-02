#include <stdio.h>

int main()

{
    int i;

    for(i=1;i<=2022;i++)
    {
        if((i%4==0 && i%100!=0) || (i%400!=0))
        {
            printf("%d is leap year\n",i);
        }
    }

    return 0;
}
