#include <stdio.h>

struct class
{
    int number;
    char name[20];
    float marks;
};

void main(void)
{
    struct class student1={111,"Rahim",45.50};
    struct class student2={21,"Karim",56.8};
    struct class student3;
    struct class student4;
    scanf("%d %s %f",&student3.number,student3.name,&student3.marks);
    student4=student2;
    printf("%d %s %f",student4.number,student4.name,student4.marks);
}
