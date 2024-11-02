#include <iostream>

using namespace std;

void sort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main(){

    int mice[] = {4,-4,2};
    int hole[] = {4,0,5};
    int n=3;

    cout << "Mice Position: ";
    for(int i=0;i<n;i++){
        cout << mice[i] << " ";
    }
    cout << endl;

    cout << "Hole Position: ";
    for(int i=0;i<n;i++){
        cout << hole[i] << " ";
    }
    cout << endl;

    sort(mice,n);

    sort(hole,n);


    cout << "Position sorted: ";
    cout << endl;


    cout << "Mice Position: ";
    for(int i=0;i<n;i++){
        cout << mice[i] << " ";
    }
    cout << endl;

    cout << "Hole Position: ";
    for(int i=0;i<n;i++){
        cout << hole[i] << " ";
    }
    cout << endl;

    int time = 0;
    int maxTime =0;
    for(int i=0;i<n;i++){
        time = abs(mice[i] - hole[i]);
        if(time > maxTime){
            maxTime = time;
        }
    }

    cout << "Max time : " << maxTime;



    return 0;
}
