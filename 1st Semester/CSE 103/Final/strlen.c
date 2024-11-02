#include <stdio.h>

    int my_strlen(char str[])
    {
        int i=0,len=0;

        while(str[i]!='\0')
        {
            i++;
            len++;
        }
        return len;
    }

    int main()
    {
       char s[50];

        printf("Enter a string : ");
        gets(s);
        my_strlen(return);
        printf("Length = %d ",len);

        return 0;
    }
