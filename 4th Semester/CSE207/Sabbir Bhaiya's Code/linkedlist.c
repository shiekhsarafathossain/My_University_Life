#include <stdio.h>
#define MAX_NODES 100

typedef struct node {
    int value;
    struct node* next;
} Node;

// Define the linked list
Node nodes[MAX_NODES];
int num_nodes = 0;
Node* head = NULL;

// Insert a new node at the end of the linked list
void insert_node(int value) {
    if (num_nodes == MAX_NODES) {
        printf("Error: Maximum number of nodes reached\n");
        return;
    }
    Node* new_node = &nodes[num_nodes++];
    new_node->value = value;
    new_node->next = NULL;
    if (head == NULL) {
        head = new_node;
    } else {
        Node* current = head;
        while (current->next != NULL) {
            current = current->next;
        }
        current->next = new_node;
    }
}

// Insert a new node at the beginning of the linked list
void insert_node_at_beginning(int value) {
    if (num_nodes == MAX_NODES) {
        printf("Error: Maximum number of nodes reached\n");
        return;
    }
    Node* new_node = &nodes[num_nodes++];
    new_node->value = value;
    new_node->next = head;
    head = new_node;
}

// Insert a new node at any position in the linked list
void insert_node_at_position(int position, int value) {
    if (num_nodes == MAX_NODES) {
        printf("Error: Maximum number of nodes reached\n");
        return;
    }
    if (position < 0 || position > num_nodes) {
        printf("Error: Invalid position\n");
        return;
    }
    Node* new_node = &nodes[num_nodes++];
    new_node->value = value;
    if (position == 0) {
        new_node->next = head;
        head = new_node;
    } else {
        Node* current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current->next;
        }
        new_node->next = current->next;
        current->next = new_node;
    }
}

// Delete the last node in the linked list
void delete_last_node() {
    if (head == NULL) {
        printf("Error: Linked list is empty\n");
        return;
    }
    if (num_nodes == 1) {
        head = NULL;
        num_nodes--;
    } else {
        Node* current = head;
        while (current->next->next != NULL) {
            current = current->next;
        }
        current->next = NULL;
        num_nodes--;
    }
}

// Delete the first node in the linked list
void delete_first_node() {
    if (head == NULL) {
        printf("Error: Linked list is empty\n");
        return;
    }
    head = head->next;
    num_nodes--;
}

// Delete a node at any position in the linked list
void delete_node_at_position(int position) {
    if (head == NULL) {
        printf("Error: Linked list is empty\n");
        return;
    }
    if (position < 0 || position >= num_nodes) {
        printf("Error: Invalid position\n");
        return;
    }
    if (position == 0) {
        head = head->next;
    } else {

Node* current = head;
for (int i = 0; i < position - 1; i++) {
    current = current->next;
}
current->next = current->next->next;
num_nodes--;
}}

// Print the linked list
void print_linked_list() {
Node* current = head;
printf("Linked list: ");
while (current != NULL) {
printf("%d ", current->value);
current = current->next;
}
printf("\n");
}

// Main function with menu
int main() {
    int choice, position, value;

    while (1) {
        printf("\nLinked List Operations\n");
        printf("1. Insert New Node\n");
        printf("2. Insert Node at Beginning\n");
        printf("3. Insert Node at Any Position\n");
        printf("4. Delete Node from Last Position\n");
        printf("5. Delete Node from Beginning\n");
        printf("6. Delete Node from Any Position\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the value to insert: ");
                scanf("%d", &value);
                insert_node(value);
                print_linked_list();
                break;
            case 2:
                printf("Enter the value to insert: ");
                scanf("%d", &value);
                insert_node_at_beginning(value);
                print_linked_list();
                break;
            case 3:
                printf("Enter the position to insert: ");
                scanf("%d", &position);
                printf("Enter the value to insert: ");
                scanf("%d", &value);
                insert_node_at_position(position, value);
                print_linked_list();
                break;
            case 4:
                delete_last_node();
                print_linked_list();
                break;
            case 5:
                delete_first_node();
                print_linked_list();
                break;
            case 6:
                printf("Enter the position to delete: ");
                scanf("%d", &position);
                delete_node_at_position(position);
                print_linked_list();
                break;
            case 7:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}
