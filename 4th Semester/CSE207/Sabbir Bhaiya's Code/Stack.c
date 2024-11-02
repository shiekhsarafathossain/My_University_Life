#include <stdio.h>
#include <stdlib.h>

int main() {
    int size, top = -1, choice, item;

    printf("Enter the size of the stack: ");
    scanf("%d", &size);
    int stack[size];

    while (1) {
        printf("\nStack Operations:\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                if (top >= size-1) {
                    printf("Stack overflow!\n");
                    break;
                }
                printf("Enter the element to push onto the stack: ");
                scanf("%d", &item);
                stack[++top] = item;
                printf("Pushed %d onto the stack.\n", item);
                break;
            case 2:
                if (top < 0) {
                printf("Stack underflow!\n");
                break;
                }
            int popped_item = stack[top];
            top--;
            printf("Popped %d from the stack.\n", popped_item);
            break;

            case 3:
                if (top < 0) {
                    printf("Stack is empty!\n");
                    break;
                }
                printf("Elements in the stack:\n");
                for (int i = top; i >= 0; i--)
                    printf("%d\n", stack[i]);
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice!\n");
        }
    }
    return 0;
}
