#include <iostream>
using namespace std;

void swap(int arr[],int i, int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

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

int main(){

    int n;
    cout << "Enter Array Size: ";
    cin >> n;
    int arr[n];

    cout << "Enter Array Element: " << endl;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    cout << "Original Array: " << endl;
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
    cout << endl;

    cout << "Sorted Array: " << endl;
    quicksort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }

    return 0;
}
