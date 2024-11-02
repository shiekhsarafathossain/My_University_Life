#include <stdio.h>

my_strcpy(char *s1,char *s2)
{
    char *source,*target;

    *source = s1;
    *target = source;
    *s2 = target;
    *s1 = source;

    return *s2;
}


int main()
{
    char str1[50],str2[50];

    printf("Enter a string : ");
    scanf("%s",str1);

    printf("%s copy to %s",str1,my_strcpy(str1,str2));
}

