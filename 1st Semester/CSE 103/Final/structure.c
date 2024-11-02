#include <stdio.h>

    struct books{
       char title[50];
       char author[50];
       float price;
       int copies;
    };

    int main()
    {
        struct books book1;

        printf("Enter book title: ");
        scanf("%s",book1.title);

        printf("Enter book author: ");
        scanf("%s",book1.author);

        printf("Enter book price: ");
        scanf("%f",&book1.price);

        printf("Enter number of copies: ");
        scanf("%d",&book1.copies);

    }

