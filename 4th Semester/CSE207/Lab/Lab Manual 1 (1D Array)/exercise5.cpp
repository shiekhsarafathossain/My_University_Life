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

    cout << endl << "\nEnter New Element To Insert: ";
    int ins;
    cin >> ins;

    cout << endl << "Enter Position Where To Insert: ";
    cin >> pos;

    for(int j = n; j>=pos; j--) {
        arr[j+1] = arr[j];
    }

    arr[pos]=ins;
    n++;
    cout << endl << "Your New Array Elements: " << endl;
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }

    return 0;

}



