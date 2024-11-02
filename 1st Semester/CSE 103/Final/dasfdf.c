#include <stdio.h>

struct books
{
    char booktitle[50];
    char bookauthor[30];
    float bookprice;
    int copies;

}b[500];

    int i=0;
    int count=0;
    char test;


    int showWelcomeMessage()
    {
        printf("*****************************************\n\n");
        printf("Welcome to Simple Book Management System.\n\n");
        printf("*****************************************\n\n\n\n");
    }
    int showGoodByeMessage()
    {
         printf("*****************************************\n\n");
        printf("Thank you for using Simple Book Management System.\n\n");
        printf("*****************************************\n\n\n\n");
    }

    int showMenuOptions()
    {

    printf ("\n\nPlease select a menu option number:\n");
    printf ("1) Display this menu.\n");
    printf ("2) Show all available books.\n");
    printf ("3) Add a book to the book shop.\n");
    printf ("4) Search a book by title.\n");
    printf ("5) Display the total number of books.\n");
    printf ("6) Exit from this book system\n");

    }
    showBooks()
    {
        printf("List of books: \n\n");
            if (count==0)
                printf ("No available books");
            else
            for (i=0;i<count;i++)
            {
                printf ("Book title: %s\n", b[i].booktitle);
                printf ("Book author: %s\n", b[i].bookauthor);
                printf ("Book price: %.2f\n", b[i].bookprice);
                printf ("Book copies: %d\n", b[i].copies);
                printf("\n");
            }

    }

    addBook()
    {

            printf ("Enter book title: ");
            scanf  ("%s",b[i].booktitle);
            printf ("Enter book author: ");
            scanf  ("%s",b[i].bookauthor);
            printf ("Enter book price: ");
            scanf  ("%f",&b[i].bookprice);
            printf ("Enter number of copies: ");
            scanf  ("%d",&b[i].copies);
            i=i+1;
            count++;

    }

    searchBook()
    {
        char searchbook[30];
        printf("Enter book title to search: ");
        fflush(stdin);
        gets(searchbook);

            for(int i=0; i<count; i++)
            {
                    if (searchbook[i],b[i].booktitle[i])
                    {
                    printf("Book title: %s", b[i].booktitle);
                    printf("Book author: %s", b[i].bookauthor);
                    printf("Book price: %.2f", b[i].bookprice);
                    printf("Book copies: %d", b[i].copies);
                    }
                else
                    printf("Book not found");
            }






    }

    showNumberOfBooks()
    {
        printf ("Total number of books in the shop: %d\n\n", count);

    }


    int main()

    {
       showWelcomeMessage();
       showMenuOptions();

       int choice;

       while(choice!=6)
       {

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
                showNumberOfBooks();
                break;
        case 6:
                showGoodByeMessage();
                break;

       }

    }
    }
