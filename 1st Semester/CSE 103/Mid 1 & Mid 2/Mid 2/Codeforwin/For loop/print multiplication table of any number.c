#include <stdio.h>

int main()
{
    int i,j,num;

    printf("Enter a number : ");
    scanf("%d",&num);

    for(i=1;i<=10;i++)
    {
        j = j*num;
        printf("%d X %d = %d \n",num,i,j);
    }

    return 0;
}
