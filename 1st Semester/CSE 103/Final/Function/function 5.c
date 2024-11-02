#include <stdio.h>

float calculate_grade(float mark)
{
    if(87 <= mark  <=100)
        return 'A';
    else if(77 <= mark <= 86)
        return 'B';
    else if(67 <= mark <= 76)
        return 'C';
    else if(60 <= mark <= 66)
        return 'D';
    else if(0 <= mark <= 60)
        return 'F';
    else if(100 < mark < 0)
        return 'I';
}

int main()
{
    float marks;
    char ch;

    printf("Enter Marks : ");
    scanf("%f",&marks);

    ch=calculate_grade(marks);
    printf("Your Letter Grade %c",ch);
    return 0;
}
