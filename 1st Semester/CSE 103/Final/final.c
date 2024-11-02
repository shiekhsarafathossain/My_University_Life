#include <stdio.h>

    int showWelcomeMessage()
    {
        printf("*****************************************\n\n");
        printf("Welcome to Simple Book Management System.\n\n");
        printf("*****************************************\n\n\n\n");
    }
    int showGoodByeMessage()
    {
         printf("*****************************************\n\n");
        printf("Thank you for using Simple Book Managment System.\n\n");
        printf("*****************************************\n\n\n\n");
    }

    int showMenuOptions()
    {
        int n;
        printf("Please select a menu option number:\n1.Display this menu.\n2.Show all available books.\n3.Add a book to the book shop.\n4.Search a book by title.\n5.Display the total number of books.\n6.Exit from this book shop system.\n\n\n\n");

    }
    showBooks()
    {


    }

    addBook()

    {
        int i,n;
         {
              struct books {
	char book_name[20];
	float price;
	int pages;
};

	struct books b[500];

	printf("How many book you want to add: ");
	scanf("%d",&n);

	for(i=0;i<n;i++)
    {

	printf ("Enter data for book 1\n");
	printf ("Book Name: ");
	scanf ("%s", b[i].book_name);
	printf ("Price: ");
	scanf ("%f", &b[i].price);
	printf ("Number of Pages: ");
	scanf ("%d", &b[i].pages);

            }

            printf("output\n\n\n\n");
    for(i=0;i<n;i++)
    {
        printf("Book name: %s\n",b[i].book_name);
        printf("Book price: %f\n",b[i].price);
        printf("Book pages: %d\n",b[i].pages);
    }
         }

    }

    searchBook()
    {


    }

    showNumberOfBooks()
    {

    }


    int main()
    {
       showWelcomeMessage();
       showMenuOptions();

       int choice;

       printf("Enter your choice:");
       scanf("%d",&choice);

       switch(choice)
       {
        case 1:
                printf("you have choosed 1\n\n\n\n");
                break;
        case 2:
                printf("you have choosed 2\n\n\n\n");
                showBooks();
                break;
        case 3:
        addBook();



                break;
        case 4:
                printf("you have choosed 4\n\n\n\n");
                searchBook();
                break;
        case 5 :
                printf("you have choosed 5\n\n\n\n");
                showNumberOfBooks();
                break;
        case 6:
                printf("you have choosed 6\n\n\n\n");
                showGoodByeMessage();
                break;

       }

    }
