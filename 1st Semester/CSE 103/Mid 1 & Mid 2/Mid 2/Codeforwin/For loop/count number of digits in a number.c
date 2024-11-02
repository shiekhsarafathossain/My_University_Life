#include <stdio.h>

int main()

{
    int count,num;

    scanf("%d",&num);

    for(count=0;num!=0;++count)
    {
        num = num/10;
    }
    printf("%d",count);
}
