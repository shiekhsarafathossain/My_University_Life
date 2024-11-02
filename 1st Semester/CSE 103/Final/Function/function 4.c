#include <stdio.h>

char change_case(char ch)
{
    char c3;

    if(ch >= 'A' && ch <= 'Z')
        c3 = ch + ('a'-'A');
    else
        c3 = ch - ('a'-'A');

    return c3;
}

int main()
{
    char c1,c2;
    printf("Enter a letter: ");
    scanf("%c",&c1);

    c2 = change_case(c1);

    printf("Opposite letter is %c",c2);

    return 0;
}
