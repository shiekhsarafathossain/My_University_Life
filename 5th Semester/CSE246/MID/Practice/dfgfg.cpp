#include <iostream>

// Function to find the maximum subarray crossing the midpoint
int maxCrossingSubarray(int arr[], int low, int mid, int high) {
    int left_sum = -2147483647;
    int sum = 0;
    for (int i = mid; i >= low; i--) {
        sum += arr[i];
        if (sum > left_sum)
            left_sum = sum;
    }

    int right_sum = -2147483647;
    sum = 0;
    for (int i = mid + 1; i <= high; i++) {
        sum += arr[i];
        if (sum > right_sum)
            right_sum = sum;
    }

    return left_sum + right_sum;
}

// Function to find the maximum subarray using divide and conquer
int maxSubarraySum(int arr[], int low, int high) {
    if (low == high)
        return arr[low];

    int mid = (low + high) / 2;

    // Find the maximum of three possible cases:
    // 1. Maximum subarray sum in the left half
    int left_max = maxSubarraySum(arr, low, mid);

    // 2. Maximum subarray sum in the right half
    int right_max = maxSubarraySum(arr, mid + 1, high);

    // 3. Maximum subarray sum crossing the midpoint
    int cross_max = maxCrossingSubarray(arr, low, mid, high);

    // Return the maximum of the three
    if (left_max >= right_max && left_max >= cross_max)
        return left_max;
    else if (right_max >= left_max && right_max >= cross_max)
        return right_max;
    else
        return cross_max;
}

int main() {
    int arr[] = {-2, -5, 6, -2, -3, 1, 5, -6};
    int n = sizeof(arr) / sizeof(arr[0]);

    int max_sum = maxSubarraySum(arr, 0, n - 1);

    std::cout << "Maximum subarray sum: " << max_sum << std::endl;

    return 0;
}
