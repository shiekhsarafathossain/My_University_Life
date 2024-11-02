#include <bits/stdc++.h>
using namespace std;

const int MAX_N = 1000;
void findLIS(int arr[], int n) {

    int dp[MAX_N];

    int prev[MAX_N];


    for (int i = 0; i < n; ++i) {
        dp[i] = 1;
        prev[i] = -1;
    }

    int maxLength = 1;
    int endIndex = 0;


    for (int i = 1; i < n; ++i) {
        for (int j = 0; j < i; ++j) {
            if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1;
                prev[i] = j;
            }
        }
        if (dp[i] > maxLength) {
            maxLength = dp[i];
            endIndex = i;
        }
    }

    int lisSequence[MAX_N];
    int idx = maxLength - 1;
    lisSequence[idx--] = arr[endIndex];
    int current = endIndex;
    while (prev[current] != -1) {
        current = prev[current];
        lisSequence[idx--] = arr[current];
    }


    cout << maxLength << endl;


    for (int i = 0; i < maxLength; ++i) {
        cout << lisSequence[i];
        if (i != maxLength - 1)
            cout << ", ";
    }
    cout << endl;
}

int main() {
    int n = 8;
    int arr[8]= {5, 2 ,8, 6, 3, 6, 9, 7};

    findLIS(arr, n);

    return 0;
}
