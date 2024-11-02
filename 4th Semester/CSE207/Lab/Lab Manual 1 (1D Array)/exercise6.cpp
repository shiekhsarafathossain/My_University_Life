#include <iostream>

using namespace std;

int main(){
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    int arr[n];
    int arr2[n];
    cout << "Enter the elements: " << endl;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    cout << "Your Array Element: " << endl;
    for(int i=0;i<n;i++){
        cout << arr[i] << "\t";
    }

    for(int i=n-1,j=0;i>=0;i--,j++){
        arr2[j] = arr[i] ;
    }
    for(int i=0;i<n;i++){
        if(arr2[i] == arr[i]){
            cout << "\nThe array is a Palindrome";
            break;
        }
        else{
            cout << "\nThe array is not a Palindrome";
            break;
        }
    }

    return 0;


}
