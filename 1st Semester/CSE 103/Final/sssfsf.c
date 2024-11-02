#include <stdio.h>
 my_strlen(char s[])
 {
     int i=0,count=0;

     while(s[i] != '\0')
     {
         count++;
         i++;
     }
     return count;
 }

 int main()
 {
     char str[50];
     int len;

     printf("Enter a string : ");
     scanf("%s",str);

     len = my_strlen(str);

     printf("Length = %d \n",len);
 }
