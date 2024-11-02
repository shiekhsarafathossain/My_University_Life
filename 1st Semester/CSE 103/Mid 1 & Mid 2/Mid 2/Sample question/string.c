#include <stdio.h>

int main()
{
    char ch , i= 'quit';

    do
    {
        scanf("%s",&ch);
        printf("%s",ch);

    }while(ch != i);
}
