#include "stdio.h"

int main()

{

    float number;

    printf("Enter a floating point value : ");
    scanf("%f",&number);

    if (number >= 0)
    {
        if (number == 0)
            printf("The value is Zero",number);
        else
            printf("The Value %f is Positive \n",number);
    }

    else
            printf("The value %f is Negative",number);


    return 0;
}
