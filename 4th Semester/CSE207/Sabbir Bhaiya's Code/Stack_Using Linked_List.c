#include <stdio.h>
#define MAX_NODES 100

typedef struct node {
    int value;
    struct node* next;
} Node;

Node nodes[MAX_NODES];
int num_nodes = 0;
Node* head = NULL;

void push(int value) {
    if (num_nodes == MAX_NODES) {
        printf("Error: Stack Overflow\n");
        return;
    }
    Node* new_node = &nodes[num_nodes++];
    new_node->value = value;
    new_node->next = head;
    head = new_node;
}

void pop() {
    if (head == NULL) {
        printf("Error: Stack Underflow\n");
        return;
    }
    Node* temp = head;
    head = head->next;
    num_nodes--;
    printf("Popped value: %d\n", temp->value);
}

void display_stack() {
    Node* current = head;
    printf("Stack: ");
    while (current != NULL) {
        printf("%d ", current->value);
        current = current->next;
    }
    printf("\n");
}

int main() {
    int choice, value;

    while (1) {
        printf("\nStack Operations\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Display Stack\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the value to push: ");
                scanf("%d", &value);
                push(value);
                display_stack();
                break;
            case 2:
                pop();
                display_stack();
                break;
            case 3:
                display_stack();
                break;
            case 4:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}
