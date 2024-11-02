#include <iostream>

using namespace std;

int binarySearch(int arr[],int ini,int final,int target){
    int mid = (ini+final) / 2;

    if(arr[mid] == target){
        return mid;
    }

    else{
        if(arr[mid] > target){
            binarySearch(arr,ini,mid-1,target);
        }
        else{
            binarySearch(arr,mid+1,final,target);
        }
    }
}

int main(){

    int n;
    int ini=0;
    cout << "Enter Array Size: ";
    cin >> n;
    int arr[n],final=n-1;
    cout << "Enter Array Elements: ";
    cout << endl;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    int src;
    cout << "Enter element you want to search: ";
    cin >> src;

    int result = binarySearch(arr,ini,final,src);
    cout << "Found in index: " << result;

    return 0;
}
