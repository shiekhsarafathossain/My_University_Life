#include <stdio.h>
#include<string.h>
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
        printf("count = %d ",count);

}

void addBook()
{
    int n;
    printf("How many book you want to add: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
    getchar();
    printf ("\nEnter book title: ");
    gets(b[i].book_title);
    printf ("Enter book author: ");
    gets(b[i].book_author);
    printf ("Enter book price: ");
    scanf  ("%f",&b[i].price);
    printf ("Enter number of copies: ");
    scanf  ("%d",&b[i].copies);
    count++;
    }
    i=i+1;
    printf("\nBook added successfully!!\n\n");
}

void searchBook()
{
    getchar();
    char s1[50];
    int found =0;
    printf("\nEnter Book Name to search: ");
    scanf ("%[^\n]s", s1);
    for(i=0;i<count;i++)
        {
            if(strcmp(s1,b[i].book_title) == 0)
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


void showNumberOfBooks()
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
            printf("you have entered wrong choice\n\n\n\n");
        }
    }
}
