// repeatedly takes a number and shows the sum until user inputs 0 
#include "stdio.h"

main()
{
	float n, sum;

	sum=0.0;

	do
	{
		printf ("Enter a number to add (0 to exit)");
		scanf ("%f", &n);
		sum += n;
		printf ("Sum = %.2f\n", sum);
	}while (n != 0);
}
