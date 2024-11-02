#include <iostream>

// Function to merge two subarrays and count inversions
int merge(int arr[], int temp[], int left, int mid, int right) {
    int i, j, k;
    int inv_count = 0;

    i = left; // Initial index of left subarray
    j = mid; // Initial index of right subarray
    k = left; // Initial index of merged subarray

    while ((i <= mid - 1) && (j <= right)) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
            inv_count += (mid - i);
        }
    }

    // Copy the remaining elements of left subarray
    while (i <= mid - 1)
        temp[k++] = arr[i++];

    // Copy the remaining elements of right subarray
    while (j <= right)
        temp[k++] = arr[j++];

    // Copy the merged elements back to the original array
    for (i = left; i <= right; i++)
        arr[i] = temp[i];

    return inv_count;
}

// Function to merge sort and count inversions
int mergeSort(int arr[], int temp[], int left, int right) {
    int mid, inv_count = 0;
    if (right > left) {
        // Divide the array into two halves
        mid = (right + left) / 2;

        // Count inversions in the left subarray
        inv_count += mergeSort(arr, temp, left, mid);

        // Count inversions in the right subarray
        inv_count += mergeSort(arr, temp, mid + 1, right);

        // Merge the two halves and count inversions
        inv_count += merge(arr, temp, left, mid + 1, right);
    }
    return inv_count;
}

// Function to count inversions in an array
int countInversions(int arr[], int n) {
    int temp[n];
    return mergeSort(arr, temp, 0, n - 1);
}

int main() {
    int arr[] = {10, 12, 2, 3, 4, 9, 8, 7, 14, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    std::cout << "Total number of inversions: " << countInversions(arr, n) << std::endl;

    return 0;
}
