#include <stdio.h>
void swap(int *x, int *y)
{
int temp;

temp = *x;
*x = *y;
*y = temp;
}

void main(void)
{
int a, b, i;
for ( i=1; i<4; i++ )
{
a = i ;
b = i * i ;
swap(&a, &b);
printf("%d x %d\n", a, b);
}
}
