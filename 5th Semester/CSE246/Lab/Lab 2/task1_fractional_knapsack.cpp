#include <iostream>
using namespace std;

void sorting(float ratio[],int weight[],int profit[], int n){
    float temp;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(ratio[i] > ratio[j]){
                temp = ratio[i];
                ratio[i] = ratio[j];
                ratio[j] = temp;

                temp = weight[i];
                weight[i] = weight[j];
                weight[j] = temp;

                temp = profit[i];
                profit[i] = profit[j];
                profit[j] = temp;
            }
        }
    }
}

int main(){
    int n;
    cout << "Enter how many item you want to add: ";
    cin >> n;
    int w;
    cout << "Enter Capacity: ";
    cin >> w;

    int weight[n];
    int profit[n];
    float ratio[n];

    cout << "Enter Profits: ";
    for(int i=0;i<n;i++){
        cin >> profit[i];
    }
    cout << "Enter Weight: ";
    for(int i=0;i<n;i++){
        cin >> weight[i];
    }

    cout << "Profit: ";
    for(int i=0;i<n;i++){
        cout << profit[i] << " ";
    }
    cout << endl;
    cout << "Weight: ";
    for(int i=0;i<n;i++){
        cout << weight[i] << " ";
    }


    cout << endl;
    for(int i=0;i<n;i++){
        ratio[i] = (float) profit[i] / weight[i];
    }
    cout << "proportions: ";
    for(int i=0;i<n;i++){
        cout << ratio[i] << " ";
    }
    cout << endl;

    sorting(ratio,weight,profit,n);

    cout << "proportions Sorted: ";
    for(int i=0;i<n;i++){
        cout << ratio[i] << " ";
    }

    float totalprofit = 0.0;
    for(int i=0; i<n; i++){
        if(w>0 && weight[i] <= w){
            w = w-weight[i];
            totalprofit = totalprofit + profit[i];
        }
        else{
                totalprofit = totalprofit + profit[i] * ((float) w / weight[i]);
                break;
        }
    }
    cout << endl;
    cout << "Total Profit: " << totalprofit;


    return 0;
}
