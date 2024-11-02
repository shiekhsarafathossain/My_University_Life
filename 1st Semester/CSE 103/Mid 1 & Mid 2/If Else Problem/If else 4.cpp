#include "stdio.h"

int main()
{

	int a,b,c,max;

	scanf("%d %d %d",&a,&b,&c);

	if(a>b)
        max = a;

    if(b>a)
        max = b;

    if(c>max)
        max = c;

    printf("Max is %d",max);

	return 0;
}
