#include <stdio.h>
#define MAX_SIZE 10

int queue[MAX_SIZE];
int front = -1;
int rear = -1; 


int is_empty() {
    if (front == -1 && rear == -1) {
        return 1;
    }
    else {
        return 0;
    }
}


int is_full() {
    if (rear == MAX_SIZE - 1) {
        return 1;
    }
    else {
        return 0;
    }
}


void enqueue(int x) {
    if (is_full()) {
        printf("Queue is full\n");
    }
    else if (is_empty()) {
        front = 0;
        rear = 0;
        queue[rear] = x;
    }
    else {
        rear++;
        queue[rear] = x;
    }
}


void dequeue() {
    if (is_empty()) {
        printf("Queue is empty\n");
    }
    else if (front == rear) {
        printf("%d dequeued from the queue\n", queue[front]);
        front = -1;
        rear = -1;
    }
    else {
        printf("%d dequeued from the queue\n", queue[front]);
        front++;
    }
}


void display() {
    if (is_empty()) {
        printf("Queue is empty\n");
    }
    else {
        printf("Elements in the queue are: ");
        for (int i = front; i <= rear; i++) {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}

int main() {
    int choice, x;

    while (1) {
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the element to enqueue: ");
                scanf("%d", &x);
                enqueue(x);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Exiting...............\n");
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}

