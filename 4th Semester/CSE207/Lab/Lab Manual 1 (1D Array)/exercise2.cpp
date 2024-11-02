#include <iostream>

using namespace std;

int main() {

    int array[100];
    int temp;
    int n;

    cout << "Enter Array Size: ";
    cin >> n;

    cout << "Enter Array Elements: ";
    for(int i=0;i<n;i++){
        cin >> array[i];
    }

    cout << "\nYour Array Elements: " << endl;
    for(int i=0;i<n;i++){
        cout << array[i] <<"\t";
    }
    cout << endl;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(array[i] > array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    cout << "Second Maximum: " << array[n-2];
    cout << "\nSecond Minimum: " << array[1];


    return 0;


}
