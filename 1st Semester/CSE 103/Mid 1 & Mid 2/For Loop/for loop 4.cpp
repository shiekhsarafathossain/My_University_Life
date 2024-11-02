#include <stdio.h>

int main()
{
    int i,j;

    for(i=1,j=20;(i<=10)||(j<=20);i++,j--)
    {
        printf("%d\n",i);
        printf("%d\n",j);
    }
}
