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

void dequeue(struct Queue* queue)
{
    if (queue->front == NULL)
    {
        printf("Queue is empty. Cannot dequeue.\n");
    }
    else
    {
        struct Node* temp = queue->front;
        queue->front = queue->front->next;
        temp=0;
    }
}

int main()
{
    struct Queue* Q1 = createQueue();
    int data;
    while(1)
    {
        cout << "1.Enqueue\n" << "2.Dequeue\n" << "3.exit\n";
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
            dequeue(Q1);
        }
        else if(choice == 3)
        {
            exit(0);
        }
    }

    return 0;
}
