#include "stdio.h"

int main()
{
    int a,b,result;
    char c;

    scanf("%d \n %d \n %c",&a,&b,&c);

    if(c=='+')
    {
        result = a+b;
        printf("%d",result);
    }

    else if (c=='-')
    {
        result = a-b;
        printf("%d",result);
    }

    else if(c=='/')
    {
        result = a/b;
        printf("%d",result);
    }

    else if(c=='*')
    {
        result = a*b;
        printf("%d",result);
    }

    else
    {
        printf("Wrong Syntex");
    }

	return 0;
}
