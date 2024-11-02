#include <iostream>

using namespace std;

void merge(int arr[], int l, int r, int mid){
    int n1 = mid-l+1;
    int n2 = r-mid;

    int a[n1];
    int b[n2];

    for(int i=0; i<n1;i++){
        a[i] = arr[l+i];
    }

    for(int i=0;i<n2;i++){
        b[i] = arr[(mid+1)+i];
    }
    int i=0;
    int j=0;
    int k=l;

    while(i<n1 && j<n2){
        if(a[i] < b[j]){
            arr[k]= a[i];
            i++;
            k++;
        }
        else{
            arr[k] = b[i];
            j++;
            k++;
        }
    }

    while(i<n1){
        arr[k] = a[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = b[j];
        j++;
        k++;
    }

}

void mergesoft(int arr[],int l, int r){
    if(l<r){
        int mid = (l+r) / 2;
        mergesoft(arr,l,mid);
        mergesoft(arr,mid+1,r);

        merge(arr,l,r,mid);
    }
}


int main(){
    int arr[] = {9,7,12};
    int n=3;

    cout << "Original Array: " << endl;
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
    cout << endl;

    cout << "Sorted Array: " << endl;
    mergesoft(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }


    return 0;
}
