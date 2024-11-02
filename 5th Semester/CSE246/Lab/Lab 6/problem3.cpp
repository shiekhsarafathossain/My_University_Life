#include <bits/stdc++.h>

using namespace std;

struct Result {
    int maxLen;
    int endIndex;
};

Result longestCommonSubstring(string str1, string str2) {
    int m = str1.length();
    int n = str2.length();

    Result result;
    result.maxLen = 0;
    result.endIndex = 0;


    int dp[m + 1][n + 1];


    for (int i = 0; i <= m; ++i) {
        for (int j = 0; j <= n; ++j) {
            dp[i][j] = 0;
        }
    }


    for (int i = 1; i <= m; ++i) {
        for (int j = 1; j <= n; ++j) {
            if (str1[i - 1] == str2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
                if (dp[i][j] > result.maxLen) {
                    result.maxLen = dp[i][j];
                    result.endIndex = i - 1;
                }
            }
            else {
                dp[i][j] = 0;
            }
        }
    }

    return result;
}

int main() {
    string str1 = "ABCDGH";
    string str2 = "ACDGHR";

    Result result = longestCommonSubstring(str1, str2);

    string longestSubstr = str1.substr(result.endIndex - result.maxLen + 1, result.maxLen);

    cout << "Length of the longest common substring: " << result.maxLen << endl;
    cout << "Longest common substring: " << longestSubstr << endl;

    return 0;
}
