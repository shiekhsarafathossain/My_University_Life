#include "stdio.h"

int main()
{

	int av,av1;

	scanf("%d",&av);

	if(av>0)

        printf("Absolute Value of %d is %d",av,av);

    else if(av<0)
    {
        av1 = av/-1;
        printf("Absolute Value of %d is %d",av,av1);
    }
    else

        printf("Absolute Value is Zero");



	return 0;
}
