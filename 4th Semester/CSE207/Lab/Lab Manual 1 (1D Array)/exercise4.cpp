#include <iostream>

using namespace std;

int main() {

    int arr[100];
    int n;
    int pos;
    cout << "Enter Array Size: ";
    cin >> n;

    cout << endl << "Enter Array Elements: " << endl;
    for(int i =0; i<n; i++) {
        cin >> arr[i];
    }

    cout << endl << "Your Array Elements: " << endl;
    for(int i =0; i<n; i++) {
        cout << arr[i] << " ";
    }

    cout << endl << "\nEnter Position to delete: ";
    cin >> pos;
    int temp;
    for(int i=pos-1; i<n; i++) {
        temp = arr[i];
        arr[i] = arr[i+1];
    }

    cout << endl << "Your New Array Elements: " << endl;
    for(int i=0; i<n-1; i++) {
        cout << arr[i] << " ";
    }

    return 0;

}
