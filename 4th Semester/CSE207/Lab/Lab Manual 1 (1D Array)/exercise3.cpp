#include <iostream>

using namespace std;

int main(){

    int n;
    cout << "Enter Array Size: ";
    cin >> n;
    int arr[n];

    cout << "Enter Array Elements: ";
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    int length = sizeof(arr)/sizeof(arr[0]);

    cout << "Duplicate elements in given array: " <<endl;

    for(int i=0;i<length;i++){
        for(int j=i+1;j<length;j++){
            if(arr[i] == arr[j]){
                cout << arr[j] << " ";
            }
        }
    }

    return 0;

}
