#include <stdio.h>

int main()

{

	int base,expo,result,i;

	printf("Enter Base : ");
	scanf("%d", &base);

	printf("Enter Exponent : ");
	scanf("%d", &expo);

	for(i=1,result=1;i<=expo;i++)
		{
		result*=base;
		}
	printf("%d\n",result);

	return 0;

}
