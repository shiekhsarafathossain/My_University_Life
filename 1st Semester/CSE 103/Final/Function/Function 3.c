#include <stdio.h>

char is_uppercase(char s)
{
    if(s >= 'A' && s <= 'Z')
        return 1;
    else
        return 0;
}

int main()
{
    char l;
    int result;

    printf("Enter a character: ");
    scanf("%c",&l);
    result= is_uppercase(l);

    if(result ==1)
        printf("%c is Uppercase",l);
    else
        printf("%c is Lowercase",l);
}
