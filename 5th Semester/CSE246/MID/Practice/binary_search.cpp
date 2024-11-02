#include <iostream>
using namespace std;

int binarySearch(int arr[],int i, int j, int target){
    int mid = (i+j) / 2;
    if(arr[mid] == target){
        return mid;
    }
    else{
        if(arr[mid] > target){
            binarySearch(arr,i,mid-1,target);
        }
        else{
            binarySearch(arr,mid+1,j,target);
        }
    }
}

int main(){

    int n;
    cout << "Enter Number of data you want to add: ";
    cin >> n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    int target;
    cout << "Enter Element you want to search: ";
    cin >> target;
    cout << "Found at index: " << binarySearch(arr,0,n-1,target);
    return 0;
}
