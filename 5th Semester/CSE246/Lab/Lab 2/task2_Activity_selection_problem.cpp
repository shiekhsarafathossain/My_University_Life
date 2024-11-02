#include <iostream>
using namespace std;
void sorting(int start[],int finish[],int n){
    int temp=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(finish[i]<finish[j]){
                temp = finish[i];
                finish[i] = finish[j];
                finish[j] = temp;

                temp = start[i];
                start[i] = start[j];
                start[j] = temp;
            }
        }
    }
}

void maxActivities(int s[],int f[],int n){
    int i,j;
    int count =1;
    cout << "Following activities are selected" << endl;
    i = 0;
    cout << i << " ";

    for(j=1; j<n; j++){
        if(s[j]>=f[i]){
            cout << j << " ";
            i = j;
            count++;
        }
    }

    cout << count ;

}

int main(){
    int n;
    cout << "Enter how many Activity's you want to add: ";
    cin >> n;

    int start[n],finish[n];
    cout << "Enter Start: ";
    for(int i=0;i<n;i++){
        cin >> start[i];
    }
    cout << "Enter Finish: ";
    for(int i=0;i<n;i++){
        cin >> finish[i];
    }

    cout << "Start: ";
    for(int i=0;i<n;i++){
        cout << start[i] << " ";
    }
    cout << endl;
    cout << "Finish: ";
    for(int i=0;i<n;i++){
        cout << finish[i] << " ";
    }

    sorting(start,finish,n);
    cout<< endl << "Sorted by finish time: " << endl;
    cout << "Start: ";
    for(int i=0;i<n;i++){
        cout << start[i] << " ";
    }
    cout << endl;
    cout << "Finish: ";
    for(int i=0;i<n;i++){
        cout << finish[i] << " ";
    }
    cout << endl;
    maxActivities(start,finish,n);


    return 0;
}
