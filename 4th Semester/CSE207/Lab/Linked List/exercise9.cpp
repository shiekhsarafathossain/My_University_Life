#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node* next;
};

struct Node* createNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL)
    {
        cout << "Memory allocation failed!" << endl;
        exit(0);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

void insertNodeAtEnd(struct Node** head, int data)
{
    struct Node* newNode = createNode(data);
    if (*head == NULL)
    {
        *head = newNode;
        return;
    }
    struct Node* temp = *head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = newNode;
}

void removeDuplicates(struct Node** head) {
    struct Node *current = *head, *temp = NULL, *prev = NULL;
    while (current != NULL) {
        prev = current;
        temp = current->next;
        while (temp != NULL) {
            if (current->data == temp->data) {
                prev->next = temp->next;
                free(temp);
                temp = prev->next;
            } else {
                prev = temp;
                temp = temp->next;
            }
        }
        current = current->next;
    }
}

void display(struct Node* head)
{
    if (head == NULL)
    {
        cout << "List is empty!" << endl;
        return;
    }
    struct Node* temp = head;
    cout << "Linked List: ";
    while (temp != NULL)
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}


int main() {
    struct Node* head = NULL;
    int data;
    char choice;

    do {
        cout << "Enter data for the new node: ";
        cin >> data;
        insertNodeAtEnd(&head, data);

        cout << "Do you want to add another node? (y/n): ";
        cin >> choice;

    } while (choice == 'y' || choice == 'Y');

    display(head);

    removeDuplicates(&head);
    cout << "After Removing Duplicates ";
    display(head);

    return 0;
}
