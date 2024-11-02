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

int pop(struct Queue* queue)
{
    if (queue->front == NULL)
    {
        cout << "Queue is empty. Cannot dequeue.\n";
        return -1;
    }
    else
    {
        struct Node* temp = queue->front;
        int data = temp->data;
        queue->front = queue->front->next;
        free(temp);
        return data;
    }
}

void stackToQueue(struct Queue* queue, struct Queue* tempStack)
{
    while (tempStack->front != NULL)
    {
        int data = pop(tempStack);
        enqueue(queue, data);
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
    struct Queue* queue = createQueue();
    struct Queue* tempStack = createQueue();
    int data;

    while (1)
    {
        cout << "1.Enqueue into Stack\n" << "2.Stack to Queue Creation\n" << "3.Print Queue\n"  << "4.Exit\n";
        int choice;
        cin >> choice;

        if (choice == 1)
        {
            cout << "Enter elements for Stack (Enter -1 to stop): \n";
            while (1)
            {
                cin >> data;
                if (data == -1)
                {
                    break;
                }
                enqueue(tempStack, data);
            }
        }
        else if (choice == 2)
        {
            stackToQueue(queue, tempStack);
        }
        else if (choice == 3)
        {
            printQueue(queue);
        }
        else if (choice == 4)
        {
            exit(0);
        }
    }

    return 0;
}
