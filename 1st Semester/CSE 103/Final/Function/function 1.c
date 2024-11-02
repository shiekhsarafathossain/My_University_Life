#include <stdio.h>

    int is_even(int a)
    {

        if(a%2 == 0)
                return 1;


        else
            return 0;
    }

    int main()
    {
        int num, result;

        printf("Enter a number: ");
        scanf("%d",&num);
        result = is_even(num);

        if(result == 1)
            printf("%d is even number",num);
        else
            printf("%d is odd number",num);

    }
