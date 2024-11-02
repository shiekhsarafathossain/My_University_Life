#include "stdio.h"

int main()
{

    int marks;

    printf("Enter your marks here : ");
    scanf("%d",&marks);

    if (marks >= 97 && marks <= 100)
        printf("You Got A+");
    else if (marks >= 90 && marks <= 97)
        printf("You Got A");
    else if (marks >= 87 && marks <= 90)
        printf("You Got A-");
    else if (marks >= 83 && marks <= 87)
        printf("You Got B+");
    else if (marks >= 80 && marks <= 83)
        printf("You Got B");
    else if (marks >= 77 && marks <= 80)
        printf("You Got B-");
    else if (marks >= 73 && marks <= 77)
        printf("You Got C+");
    else if (marks >= 70 && marks <= 73)
        printf("You Got C");
    else if (marks >= 67 && marks <= 70)
        printf("You Got C-");
    else if (marks >= 63 && marks <= 67)
        printf("You Got D+");
    else if (marks >= 60 && marks <= 63)
        printf("You Got D");
    else if (marks >= 0 && marks <= 60)
        printf("You Failed");
    else
        printf("You Entered non-valid Marks");

    return 0;

}
