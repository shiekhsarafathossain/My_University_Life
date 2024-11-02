// repeatedly takes choice of operation (of arithmetic operations (+, -, *, /) and two integer numbers, and then it performs the operation chosen and displays the output. This procedure is carried out until user chooses #.

#include "stdio.h"

main()
{
	char choice;
	int n1, n2;

	do
	{
		printf ("Enter your operation (# to exit): ");
		scanf("%c\n", &choice);
        printf ("Enter the first number: ");
		scanf ("%d\n", &n1);
		printf ("Enter the second number: ");
		scanf ("%d\n", &n2);

        if(choice == '+')
            printf ("Result: %d\n", n1+n2);
        else if (choice == '-')
            printf ("Result: %d\n", n1-n2);
        else if (choice == '*')
            printf ("Result: %d\n", n1*n2);
        else if (choice == '/')
            printf ("Result: %d\n", n1/n2);
        else if (choice == '#')
            break;
        else
            printf ("Wrong choice, try again\n");
	}while (choice != '#');
}
