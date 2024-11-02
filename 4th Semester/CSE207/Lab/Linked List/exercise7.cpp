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

void deletenodeatanyPosition(struct Node** head, int position) {
    if (*head == NULL) {
        cout << "List is empty" << endl;
        return;
    }
    struct Node* temp = *head;
    if (position == 0) {
        *head = temp->next;
        free(temp);
        return;
    }
    for (int i = 0; temp != NULL && i < position - 1; ++i) {
        temp = temp->next;
    }
    if (temp == NULL || temp->next == NULL) {
        cout << "Position is out of range!";
        return;
    }
    struct Node* nextNode = temp->next->next;
    free(temp->next);
    temp->next = nextNode;
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
        insertNodeAtEnd(&head, data);

        cout << "Do you want to add another node? (y/n): ";
        cin >> choice;

    } while (choice == 'y' || choice == 'Y');

    cout << "Enter Node position to delete: ";
    cin >> pos;

    deletenodeatanyPosition(&head,pos);
    display(head);

    return 0;
}
