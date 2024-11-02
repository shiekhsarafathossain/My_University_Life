#include <stdio.h>
#include<string.h>
void headMessage()//Head message
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

void showWelcomeMessage()   //Welcoming function
{
    printf("\t\t\t\t\t*****************************************\n\n");
    printf("\t\t\t\t\tWelcome to Simple Book Management System.\n\n");
    printf("\t\t\t\t\t*****************************************\n\n\n\n");
}

void  showGoodByeMessage()  //Goodbye function
{
    printf("\n\n\t\t\t\t************************************************\n\n");
    printf("\t\t\t\tThank you for using Simple Book Managment System.\n\n");
    printf("\t\t\t\t*************************************************\n\n\n\n");
}

void showMenuOptions()  //menu function

{
    printf ("\n\nPlease select a menu option number:\n");
    printf ("1) Display this menu.\n");
    printf ("2) Show all available books.\n");
    printf ("3) Add a book to the book shop.\n");
    printf ("4) Search a book by title.\n");
    printf ("5) Display the total number of books.\n");
    printf ("6) Exit from this book system\n");
}

int i=0;        //to run loops
int count=0;    //to count books
struct books    //to store book information
{
    char book_title[50];
    char book_author[30];
    float price;
    int copies;

} b[500];

void showBooks()    //to show book list
{

    if (count==0)    //when the library has no books
        printf ("No available books");
    else
    {
        printf("\n\nList of books: \n\n");
        for (i=0; i<count; i++)     //to print book information
        {
            printf ("Book title: %s\n", b[i].book_title);
            printf ("Book author: %s\n", b[i].book_author);
            printf ("Book price: %.2f\n", b[i].price);
            printf ("Book copies: %d\n", b[i].copies);
            printf("\n");
        }
    }

}

void addBook()  //to add books in the library
{
    getchar();      //to take multiple words input
    printf ("\nEnter book title: ");
    gets(b[i].book_title);
    printf ("Enter book author: ");
    gets(b[i].book_author);
    printf ("Enter book price: ");
    scanf  ("%f",&b[i].price);
    printf ("Enter number of copies: ");
    scanf  ("%d",&b[i].copies);
    i=i+1;
    count++;        //book count increases as books are added
    printf("\nBook added successfully!!\n\n");
}

void searchBook()       //to search a book in the library
{
    char s1[50];
    int found =0;
    if(count==0)
    {
        printf("No books added to the library");
    }
    else
    {
        getchar();
        printf("\nEnter Book Name to search: \n");
        gets(s1);
        for(i=0; i<count; i++)
        {
            if(strcmp(s1,b[i].book_title) == 0)  //used string.h Library function to search a book
            {
                found=1;
                printf("Book Name   : %s\n", b[i].book_title);
                printf("Author Name : %s\n", b[i].book_author);
                printf("Book price : %f\n", b[i].price);
                printf("Number of books: %d\n ",b[i].copies);
            }
        }
        if(found==0)
        {
            printf("\nBook Not Found\n");
        }
    }

}


void showNumberOfBooks()    //to show total books in the library
{
    printf ("Total number of books in the shop: %d\n\n", count);
}
int main()
{
    headMessage();
    showWelcomeMessage();
    showMenuOptions();

    int choice;
    char s1[50];

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
            printf("you have entered wrong choice\n\n\n\n"); //if the user inputs a wrong choice
        }
    }
}
