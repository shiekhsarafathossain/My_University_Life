#include "stdio.h"

int main()
{
	int i, j;
	float fac, series_sum;

	series_sum=0;
	for (i=1; i<=7; i++)
	{
		for (j=1, fac=1; j<=i; j++)
		{
			fac *=j;
		}
		series_sum += 1/fac;
	}
	printf ("The value of the series is: %f\n", series_sum);
}
