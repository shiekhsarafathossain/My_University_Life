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

void insertNodeAtPosition(struct Node** head, int data, int position) {
    struct Node* newNode = createNode(data);
    if (position == 0) {
        newNode->next = *head;
        *head = newNode;
        return;
    }
    struct Node* temp = *head;
    for (int i = 0; i < position - 1 && temp != NULL; ++i) {
        temp = temp->next;
    }
    if (temp == NULL) {
        cout << "Position is out of range!\n";
        return;
    }
    newNode->next = temp->next;
    temp->next = newNode;
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
    int pos;

    do {
        cout << "Enter data for the new node: ";
        cin >> data;
        cout << "Enter position to insert the node: ";
        cin >> pos;
        insertNodeAtPosition(&head, data, pos);

        cout << "Do you want to add another node at a specific position? (y/n): ";
        cin >> choice;

    } while (choice == 'y' || choice == 'Y');

    display(head);

    return 0;
}
