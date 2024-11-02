#include <stdio.h>

int main()
{
	int n,fac;

	printf("Enter an integer number : ");
	scanf("d",&n);

	for(fac=1;n>=1;n--)
	{
	fac*=n;
	}

	printf("Factorial is %d\n",fac);
}
