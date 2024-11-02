#include <iostream>

using namespace std;

bool canMakeChangeInfinite(int coins[], int n, int K) {
    int dp[K + 1];
    dp[0] = true;

    for (int i = 1; i <= K; i++)
        dp[i] = false;

    for (int i = 0; i < n; i++) {
        for (int j = coins[i]; j <= K; j++) {
            if (dp[j - coins[i]])
                dp[j] = true;
        }
    }

    return dp[K];
}

bool canMakeChangeFinite(int coins[], int n, int K) {
    bool dp[n + 1][K + 1];

    for (int i = 0; i <= n; i++)
        dp[i][0] = true;

    for (int i = 1; i <= K; i++)
        dp[0][i] = false;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= K; j++) {
            if (coins[i - 1] <= j)
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - coins[i - 1]];
            else
                dp[i][j] = dp[i - 1][j];
        }
    }

    return dp[n][K];
}

int main() {
    int n;
    cin >> n;

    int coins[n];
    for (int i = 0; i < n; i++)
        cin >> coins[i];

    int K;
    cin >> K;

    cout << "Using infinite coins: ";
    if (canMakeChangeInfinite(coins, n, K))
        cout << "Yes" << endl;
    else
        cout << "No" << endl;

    cout << "Using finite coins: ";
    if (canMakeChangeFinite(coins, n, K))
        cout << "Yes" << endl;
    else
        cout << "No" << endl;

    return 0;
}
