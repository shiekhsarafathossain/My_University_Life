#include <iostream>
using namespace std;
// Function to swap two integers
void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

// Function to perform bubble sort on arrays arr[] and losses[]
void bubbleSort(int arr[], int losses[], int n) {
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
                swap(losses[j], losses[j + 1]);
            }
        }
    }
}

// Function to find the minimum loss and sequence of jobs
void findMinLoss(int times[], int losses[], int n) {
    // Sort jobs based on time required
    bubbleSort(times, losses, n);

    // Calculate total loss
    int totalLoss = 0;
    int currentDelay = 0;
    for (int i = 0; i < n; ++i) {
        currentDelay += times[i];
        totalLoss += currentDelay * losses[i];
    }

    // Output minimum total loss
    cout << "Minimum total loss: " << totalLoss << endl;
}

int main() {
    // Input: Number of jobs (N)
    int N;
    cout << "Enter the number of jobs: ";
    cin >> N;

    // Arrays to store times and losses for each job
    int times[N];
    int losses[N];

    // Input: Time required and loss for each job
    cout << "Enter time required and loss for each job:\n";
    for (int i = 0; i < N; ++i) {
        cin >> times[i] >> losses[i];
    }

    cout << "time required for each job: \n";
    for (int i = 0; i < N; ++i) {
        cout << times[i] << " ";
    }
    cout << endl;
    cout << "loss for each job: \n";
    for (int i = 0; i < N; ++i) {
        cout << losses[i] << " ";
    }
    cout << endl;
    bubbleSort(times,losses,N);

    cout << "time required for each job: \n";
    for (int i = 0; i < N; ++i) {
        cout << times[i] << " ";
    }
    cout << endl;
   cout << "loss for each job: \n";
    for (int i = 0; i < N; ++i) {
        cout << losses[i] << " ";
    }

    // Find minimum loss and sequence of jobs
    findMinLoss(times, losses, N);

    return 0;
}
