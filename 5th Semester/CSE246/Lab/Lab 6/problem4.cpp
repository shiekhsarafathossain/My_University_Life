#include <bits/stdc++.h>
using namespace std;

int longestPalindromicSubsequence(string str) {
    int n = str.length();


    int dp[n][n];


    for (int i = 0; i < n; ++i)
        dp[i][i] = 1;


    for (int len = 2; len <= n; ++len) {
        for (int i = 0; i <= n - len; ++i) {
            int j = i + len - 1;
            if (str[i] == str[j]) {
                if (len == 2)
                    dp[i][j] = 2;
                else
                    dp[i][j] = dp[i + 1][j - 1] + 2;
            } else {
                dp[i][j] = max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
    }

    cout << "Longest Palindromic Subsequence: " << dp[0][n - 1];
}

int main() {
    string str="BBABCBCAB";

    longestPalindromicSubsequence(str);

    return 0;
}
