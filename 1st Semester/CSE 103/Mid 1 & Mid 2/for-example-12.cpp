#include "stdio.h"

int main()
{

	int term, n, interval, sum;

	printf ("Enter the value of N: ");
	scanf ("%d", &n);

	for (term = 4, interval = 3, sum = 0; term <= n; term += interval)
	{
		sum += term;
	}

	printf ("Result: %d\n", sum);
}
