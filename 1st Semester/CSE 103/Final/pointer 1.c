#include <stdio.h>

int swap(int *ptr1, int *ptr2)
{
    int temp;

    temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
}

int main()
{
    int num1,num2;

    printf("Enter two number : ");
    scanf("%d %d",&num1,&num2);


    printf("Before Swapping : Num1 = %d and Num2 = %d\n",num1,num2);
    swap(&num1,&num2);
    printf("After Swapping : Num1 = %d and Num2 = %d",num1,num2);

    return 0;

}
