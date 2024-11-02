#include <stdio.h>

int main()
{
    int a,b,c;

    a = 38256;
    c = 1;

    while(a!=0)
    {
        b = (a % 10);
        c = c*b;
        a = a/10;
    }
    printf("%d",c);
}
