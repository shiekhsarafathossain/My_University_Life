#include <iostream>

using namespace std;

int bs(int arr[],int target, int i, int j){
    int mid = (i+j) / 2;

    if(arr[mid] == target){
        return mid;
    }
    else{
        if(arr[mid] > target){
            bs(arr,target,i,mid-1);
        }
        else{
            bs(arr,target,mid+1,j);
        }
    }

}

int main(){
    int target = 15;
    int arr[] = {6,7,12};
    int i=0,j=3;
    cout << "Found in index: " << bs(arr,target,i,j);

    return 0;
}
