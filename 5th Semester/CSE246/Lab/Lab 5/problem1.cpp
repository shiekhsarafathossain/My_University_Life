#include <iostream>

using namespace std;

#define MAX_ITEMS 100
#define MAX_WEIGHT 1000

int knapsack(int weights[], int values[], int n, int capacity) {
    int dp[MAX_ITEMS + 1][MAX_WEIGHT + 1];

    for (int i = 0; i <= n; ++i) {
        for (int w = 0; w <= capacity; ++w) {
            if (i == 0 || w == 0)
                dp[i][w] = 0;
            else if (weights[i - 1] <= w)
                dp[i][w] = max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
            else
                dp[i][w] = dp[i - 1][w];
        }
    }

    return dp[n][capacity];
}

int main() {
    int weights[] = {2, 3, 4, 5};
    int values[] = {3, 4, 5, 6};
    int capacity = 8;

    int n = sizeof(weights) / sizeof(weights[0]);

    cout << "Maximum value: " << knapsack(weights, values, n, capacity) << endl;

    return 0;
}
