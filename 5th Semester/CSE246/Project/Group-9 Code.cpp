#include <iostream>
#include <string>
using namespace std;

// Define penalties
const int Pgap = 2;
const int Pxy = 3;

// Function to find the minimum penalty and align the sequences
void sequenceAlignment(string X, string Y) {
    int m = X.size();
    int n = Y.size();
  //  cout << m << " " << n;
    // Create dp table
    int dp[m + 1][n + 1];

    // Initialize the dp table
    for (int i = 0; i <= m; ++i) {
        dp[i][0] = i * Pgap;
    }
    for (int j = 0; j <= n; ++j) {
        dp[0][j] = j * Pgap;
    }

    // Fill the dp table
    for (int i = 1; i <= m; ++i) {
        for (int j = 1; j <= n; ++j) {

            int penalty;

            if (X[i - 1] == Y[j - 1]){
                penalty = 0;
            }
            else{
                penalty = Pxy;
            }

            int matchOrMismatch = dp[i - 1][j - 1] + penalty;

            int gapInX = dp[i - 1][j] + Pgap;

            int gapInY = dp[i][j - 1] + Pgap;

            if (matchOrMismatch <= gapInX && matchOrMismatch <= gapInY){
                dp[i][j] = matchOrMismatch;
            }

            else if (matchOrMismatch >= gapInX && gapInX <= gapInY){
                dp[i][j] = gapInX;
            }

            else{
                dp[i][j] = gapInY;
            }

        }
    }

    // Print the minimum penalty
    cout << "Minimum penalty aligning two strings is: " << dp[m][n] << endl;

    // Traceback to find the aligned sequences
    int i = m, j = n;
    string alignedX, alignedY;

    while (i > 0 || j > 0) {
    if (i > 0 && j > 0) {
        if (X[i - 1] == Y[j - 1]) {
            if (dp[i][j] == dp[i - 1][j - 1]) {
                alignedX = X[i - 1] + alignedX;
                alignedY = Y[j - 1] + alignedY;
                --i;
                --j;
            }
            else {
                alignedX = X[i - 1] + alignedX;
                alignedY = Y[j - 1] + alignedY;
                --i;
                --j;
            }
        }
        else {
            if (dp[i][j] == dp[i - 1][j - 1] + Pxy) {
                alignedX = X[i - 1] + alignedX;
                alignedY = Y[j - 1] + alignedY;
                --i;
                --j;
            }
            else if (dp[i][j] == dp[i - 1][j] + Pgap) {
                alignedX = X[i - 1] + alignedX;
                alignedY = '_' + alignedY;
                --i;
            }
            else {
                alignedX = '_' + alignedX;
                alignedY = Y[j - 1] + alignedY;
                --j;
            }
        }
    }
    else if (i > 0) {
        alignedX = X[i - 1] + alignedX;
        alignedY = '_' + alignedY;
        --i;
    }
    else {
        alignedX = '_' + alignedX;
        alignedY = Y[j - 1] + alignedY;
        --j;
    }
}




    // Print the aligned sequences
    cout << "Aligned sequences are:\n";
    cout << alignedX << "\n";
    cout << alignedY << "\n";
}

int main() {
    string X = "AGCAGTGT";
    string Y = "ACGTATC";

    sequenceAlignment(X, Y);

    return 0;
}
