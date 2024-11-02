#include "stdio.h"

int main()

{
    unsigned char var;
    while(var<=254)
    {
        printf("%c has ASCII value %d \n",var,var);
        var+=1;
    }
    printf("%c has ASCII value %d \n",var,var);
}

