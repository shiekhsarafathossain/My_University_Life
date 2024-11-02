#include <stdio.h>
#include <string.h>

int main()
{
    int i,len;
    char str[50],rev;

    printf("Enter a string : ");
    scanf("%s",str);


    while(str[i]!='\0')
    {
        i++;
    }

    printf("Real output = %s \n",str);

    strrev(str);

    printf("Reversed = %s",str);


}
