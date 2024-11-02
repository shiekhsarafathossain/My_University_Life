#include <iostream>

using namespace std;

int main(){

    int arr[100];
    int i,j;
    int n,temp;
    int count=0;
    cout << "Enter number of element: ";
    cin >> n;

    cout << "Enter your Data: ";
    for(i=0;i<n;i++){
        cin >> arr[i];
    }

    cout << "Your Array: " << endl;
    for(i=0;i<n;i++){
        cout << arr[i] <<"\t";
    }

    for(i=0;i<n-1;++i){
        for(j=0;j<n-1-i;j++){
            if(arr[j] > arr[j+1]){

                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                count++;
            }
        }
    }

    cout << "\nYour Array: " << endl;
    for(i=0;i<n;i++){
        cout << arr[i] <<"\t";
    }

    cout << "\n" << count;


}
