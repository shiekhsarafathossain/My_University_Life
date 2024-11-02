#include <stdio.h>
void headMessage()
{

    printf("\t\t\t######################################################################\n");
    printf("\t\t\t######################################################################\n");
    printf("\t\t\t############                                              ############\n");
    printf("\t\t\t############      Library management System Project       ############\n");
    printf("\t\t\t############                                              ############\n");
    printf("\t\t\t######################################################################\n");
    printf("\t\t\t######################################################################\n");
    printf("\t\t\t----------------------------------------------------------------------\n\n\n");

}

void showWelcomeMessage()
{
    printf("\t\t\t\t\t*****************************************\n\n");
    printf("\t\t\t\t\tWelcome to Simple Book Management System.\n\n");
    printf("\t\t\t\t\t*****************************************\n\n\n\n");
}
void  showGoodByeMessage()
{
    printf("\n\n\t\t\t\t************************************************\n\n");
    printf("\t\t\t\tThank you for using Simple Book Managment System.\n\n");
    printf("\t\t\t\t*************************************************\n\n\n\n");
}

void showMenuOptions()
{
    printf ("\n\nPlease select a menu option number:\n");
    printf ("1) Display this menu.\n");
    printf ("2) Show all available books.\n");
    printf ("3) Add a book to the book shop.\n");
    printf ("4) Search a book by title.\n");
    printf ("5) Display the total number of books.\n");
    printf ("6) Exit from this book system\n");


}
int i=0;
int count=0;
struct books
{
    char book_title[50];
    char book_author[30];
    float price;
    int copies;

} b[500];


void showBooks()
{
    printf("%d",count);
    printf("\n\nList of books: \n\n");
    if (count==0)
        printf ("No available books");
    else
        for (i=0; i<count; i++)
        {
            printf ("Book title: %s\n", b[i].book_title);
            printf ("Book author: %s\n", b[i].book_author);
            printf ("Book price: %.2f\n", b[i].price);
            printf ("Book copies: %d\n", b[i].copies);
            printf("\n");
        }

}
void addBook()
{
        getchar();
        printf ("\nEnter book title: ");
        gets(b[i].book_title);
        printf ("Enter book author: ");
        gets(b[i].book_author);
        printf ("Enter book price: ");
        if(b[i].price >0)
        {
        scanf  ("%f",&b[i].price);
        }
        else if(b[i].price <0)
        {
            printf("wrong book price");
        }
        printf ("Enter number of copies: ");
        scanf  ("%d",&b[i].copies);
        i=i+1;
        count++;
        printf("\nBook added successfully!!\n\n");


}
void searchBook()
{
   char search[50];
    printf ("Enter book title to search: ");
    scanf  ("%s",search);

    printf("%d",count);

    for (i=0; i<count; i++)
    {
        int result= strcmp(search,b[i].book_title);
                    if (result==0)
        {

            printf ("Book title: %s", b[i].book_title);
            printf ("\nBook author: %s", b[i].book_author);
            printf ("\nBook price: %.2f", b[i].price);
            printf ("\nBook copies: %d", b[i].copies);
            break;

        }else
        printf("Book not found");
        break;
    }
}
void showNumberOfBooks()
{
    printf ("Total number of books in the shop: %d\n\n", count);

}



void main()
{
    headMessage();
    showWelcomeMessage();
    showMenuOptions();

    int choice;
    while(choice!=6)
    {
        printf("\nEnter your choice:");
        scanf("%d",&choice);

        switch(choice)
        {
        case 1:
            showMenuOptions();
            break;
        case 2:
            showBooks();
            break;
        case 3:
            addBook();
            break;
        case 4:
            searchBook();
            break;
        case 5:
            showNumberOfBooks();
            break;
        case 6:
            showGoodByeMessage();
            break;
        default:
            printf("you have entered wrong choice\n\n\n\n");
        }
    }
}
