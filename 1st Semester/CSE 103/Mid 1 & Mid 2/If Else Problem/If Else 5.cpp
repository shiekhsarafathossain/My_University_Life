#include "stdio.h"

int main()
{

	int a,b,c,min;

	scanf("%d \n %d \n %d",&a,&b,&c);

	if(a<b)
        min = a;

    else
        min = b;

    if(c<min)
        min = c;

    printf("The Minimum value is %d",min);

	return 0;
}
