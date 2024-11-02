#include <stdio.h>

int get_minimum(int a[], int n) {
    int i, min = a[0];
    for (i = 1; i < n; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}

int get_maximum(int a[], int n) {
    int i, max = a[0];
    for (i = 1; i < n; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    return max;
}

float get_average(int a[], int n) {
    int i;
    float sum = 0.0;
    for (i = 0; i < n; i++) {
        sum += a[i];
    }
    return sum / n;
}

int linear_search(int a[], int n) {
    int i,x;
    printf("Enter the element to search for: ");
    scanf("%d", &x);
    for (i = 0; i < n; i++) {
        if (a[i] == x) {
            return i;
        }
    }
    return -1;
}

void bubble_sort(int a[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (a[j] > a[j+1]) {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}

int main() {
    int a[1000], i, n, x, choice;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    printf("Enter elements in array: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }





    while(1){
    printf("\nChoose the operation to perform:\n");
    printf("1. Find minimum\n");
    printf("2. Find maximum\n");
    printf("3. Find average\n");
    printf("4. Search for an element\n");
    printf("5. Sort the array in ascending order\n");
    printf("6. Exit\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);
    switch (choice) {
        case 1:
            printf("Minimum of array is: %d\n", get_minimum(a, n));
            break;
        case 2:
            printf("Maximum of array is: %d\n", get_maximum(a, n));
            break;
        case 3:
            printf("Average of array is: %f\n", get_average(a, n));
            break;
        case 4:
            if (linear_search(a, n) != -1) {
                printf("Found in the array\n");
            } else {
                printf("%d not found in the array\n", x);
            }
            break;
        case 5:
            bubble_sort(a, n);
            printf("Sorted array in ascending order: ");
            for (i = 0; i < n; i++) {
                printf("%d ", a[i]);
            }
            printf("\n");
            break;
        case 6:
            return 0;
            break;

        default:
            printf("Invalid choice!\n");
            break;
    }
    }
    return 0;
}
