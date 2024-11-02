// shows 1 to 10 in regular and reverse order

#include "stdio.h"

void main()
{
	int i, j;

	// this for loop contains two 
	// increment/decrement operations
	for ( i=1, j=10; i <= 10; i++, j--)
	{
		printf ("%d %d\n", i, j);
	}
}
