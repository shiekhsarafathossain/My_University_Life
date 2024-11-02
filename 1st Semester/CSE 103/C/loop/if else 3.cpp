#include "stdio.h"

int main()
{
    int house_allowance,medical_allowance;
    float sal,gross_salary;

    printf("Enter your basic salary");
    scanf("%f", &sal);

    if (sal >= 30000)
    {
        house_allowance = 20;
        medical_allowance = 10;
    }

    else
    {
        house_allowance = 25;
        medical_allowance = 15;
    }

    gross_salary = sal + sal*house_allowance/100 + sal*medical_allowance/100;
    printf("Gross Salary is %f",gross_salary);

    return 0;
}
