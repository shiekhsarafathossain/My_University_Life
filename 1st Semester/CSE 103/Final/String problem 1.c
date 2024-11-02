#include <stdio.h>

    int my_strlen(char str[])
    {
        int i=0,len=0;

        while((str[i]) != '\0')
        {
            i++;
            len++;
        }
        return len;
    }

    int main()
    {
        char s1[50];
        int result;

        printf("Enter a string : ");
        gets(s1);
        result = my_strlen(s1);
        printf("Length = %d ",result);

        return 0;
    }
