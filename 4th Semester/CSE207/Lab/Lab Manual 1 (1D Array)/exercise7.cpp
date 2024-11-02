#include <iostream>

using namespace std;

int main(){
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    int arr[n];

    cout << "Enter the elements: " << endl;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    cout << "Your Array Element: " << endl;
    for(int i=0;i<n;i++){
        cout << arr[i] << "\t";
    }

    cout << "\nYour Array Element In Reversed: " << endl;
    for(int i=n-1;i>=0;i--){
        cout << arr[i] << "\t";
    }

    return 0;

}
