#include <stdio.h>

int main()

{
    int count,num;

    printf("Enter an integer number : ");
    scanf("%d",&num);


    for(count=0;num!=0;++count)
    {
        num /= 10;
    }
    printf("Number of digits = %d",count);
    return 0;
}
