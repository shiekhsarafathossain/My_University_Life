#include "stdio.h"

int main()
{
	int basic_salary, housing_allowance, medical_allowance, gross;

	printf ("Enter employee's basic salary: ");
	scanf ( "%d", &basic_salary) ;

	if ( basic_salary < 30000)
	{
		housing_allowance = 20;
		medical_allowance  = 10;
	}
	else
	{
		housing_allowance = 25;
		medical_allowance = 15;
	}

	gross = basic_salary + basic_salary*housing_allowance/100 + basic_salary*medical_allowance/100;

	printf ("Salary of the employee is : %d", gross);

	return 0;
}
