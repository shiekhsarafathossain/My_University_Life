#include <bits/stdc++.h>
using namespace std;

void longest_common_subsequence(string str1, string str2) {
    int m = str1.size();
    int n = str2.size();

    int dp[m + 1][n + 1];

    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 || j == 0)
                dp[i][j] = 0;
            else if (str1[i - 1] == str2[j - 1])
                dp[i][j] = dp[i - 1][j - 1] + 1;
            else
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
        }
    }

    int length = dp[m][n];


    string lcs;
    lcs.reserve(length);
    int i = m, j = n;
    while (i > 0 && j > 0) {
        if (str1[i - 1] == str2[j - 1]) {
            lcs.push_back(str1[i - 1]);
            i--;
            j--;
            length--;
        } else if (dp[i - 1][j] > dp[i][j - 1])
            i--;
        else
            j--;
    }


    reverse(lcs.begin(), lcs.end());


    cout << dp[m][n] << endl;
    cout << "LCS: " << lcs << endl;
}

int main() {

    string str1 = "ABCDGH";
    string str2 = "AEDFHR";

    longest_common_subsequence(str1, str2);


    return 0;
}
