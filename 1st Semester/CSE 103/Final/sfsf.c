#include "stdio.h"

void sort(int a[], int len){

	int i, j, temp;
    // Bubble sort algorithms
	for(i=0; i<=len-2; i++){
		for (j=i+1; j<=len-1; j++){
			if (a[i] > a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
}

void main(){

	int i, arr[5];

	for(i=0; i<5; i++){
		scanf("%d", &arr[i]);
	}

	sort(arr, 5);

	printf("Array after sorting:\n");
	for(i=0; i<5; i++){
		printf("%d\n", arr[i]);
	}
}
