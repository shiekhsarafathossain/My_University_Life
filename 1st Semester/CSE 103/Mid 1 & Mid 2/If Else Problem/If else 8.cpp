#include "stdio.h"

int main()
{

	int marks;

	scanf("%d", &marks);

	if(marks >= 90 && marks <= 100)
        printf("You Got A+");
    else if(marks >= 80 && marks < 90)
        printf("You Got A");
    else if(marks >= 70 && marks < 80)
        printf("You Got A-");
    else if(marks >= 0 && marks < 70)
        printf("You Failed");
    else
        printf("You entered wrong output");

	return 0;
}
