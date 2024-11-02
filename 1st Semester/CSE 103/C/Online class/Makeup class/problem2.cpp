#include "stdio.h"

int main()
{
	int number;

	printf ("Enter a value: ");
	scanf ("%d", &number) ;

	if (number%2 == 0)
		printf ("Value %d is even", number);
	else
		printf ("Value %d is odd", number);

	return 0;
}
