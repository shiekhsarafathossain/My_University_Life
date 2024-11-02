#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node* next;
};

struct Queue
{
    struct Node *front, *rear;
};

struct Node* createNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

struct Queue* createQueue()
{
    struct Queue* queue = (struct Queue*)malloc(sizeof(struct Queue));
    queue->front = queue->rear = NULL;
    return queue;
}

void enqueue(struct Queue* queue, int data)
{
    struct Node* newNode = createNode(data);
    if (queue->front == NULL)
    {
        queue->front = queue->rear = newNode;
    }
    else
    {
        queue->rear->next = newNode;
        queue->rear = newNode;
    }
}

void deleteNegative(struct Queue* queue)
{
    struct Node* curr = queue->front;
    struct Node* prev = NULL;

    while (curr != NULL)
    {
        if (curr->data < 0)
        {
            if (prev == NULL)
            {
                curr = queue->front;
            }
            else
            {
                prev->next = curr->next;
                free(curr);
                curr = prev->next;
            }
        }
        else
        {
            prev = curr;
            curr = curr->next;
        }
    }
}

void printQueue(struct Queue* queue)
{
    if (queue->front == NULL)
    {
        cout << "Queue is empty.\n";
    }
    else
    {
        struct Node* temp = queue->front;
        cout << "Queue: ";
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
}

int main()
{
    struct Queue* Q1 = createQueue();
    int data;
    while(1)
    {
        cout << "1.Enqueue\n" << "2.Delete Negative Integers\n" << "3.Print & Exit\n";
        int choice;
        cin >> choice;
        if(choice == 1)
        {
            cout << "Enter elements for Queue (Enter -1 to stop): \n";
            while (1)
            {
                cin >> data;
                if (data == -1)
                {
                    break;
                }
                enqueue(Q1, data);
            }
        }
        else if(choice == 2)
        {
            deleteNegative(Q1);
        }
        else if(choice == 3)
        {
            printQueue(Q1);
            exit(0);
        }
    }

    return 0;
}
