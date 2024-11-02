#include <stdio.h>

int main()
{
	int value,i,fact=1;

	printf("Enter a integer number : ");
	scanf("%d",&value);

	for(i=1;i<=value;i++)
	{
	fact*=i;
	}

	printf("The Factorial of %d is %d",value,fact);

	return 0;
}
