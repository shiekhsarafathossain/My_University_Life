#include <iostream>

using namespace std;

void quicksort(int arr[], int left, int right) {
    if (left < right) {
        int pivot = arr[left];
        int i = left ;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            if (i < j) {
                swap(arr[j], arr[i]);
            }
        }

        swap(arr[left], arr[j]);

        quicksort(arr, left, j - 1);
        quicksort(arr, j + 1, right);
    }
}

int main() {
    int arr[] = {5, 3, 8, 4, 2, 7, 1, 10, 6, 9};
    int n = sizeof(arr) / sizeof(arr[0]); // calculates the number of elements in the array


    quicksort(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
