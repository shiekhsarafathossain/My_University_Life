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

void insertNodeAtBeginning(struct Node** head, int data) {
    struct Node* newNode = createNode(data);
    newNode->next = *head;
    *head = newNode;
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
        insertNodeAtBeginning(&head, data);

        cout << "Do you want to add another node at the beginning? (y/n): ";
        cin >> choice;

    } while (choice == 'y' || choice == 'Y');

    display(head);

    return 0;
}
