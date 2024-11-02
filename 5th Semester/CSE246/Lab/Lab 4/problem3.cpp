#include <string.h>
#include <iostream>

using namespace std;

void computeLPSArray(char pattern[], int M, int lps[]) {
    int len = 0;
    lps[0] = 0;

    for (int i = 1; i < M; ) {
        if (pattern[i] == pattern[len]) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
    }
}

void KMPSearch(char pattern[], char text[]) {
    int M = strlen(pattern);
    int N = strlen(text);
    int lps[M];

    computeLPSArray(pattern, M, lps);

    int i = 0;
    int j = 0;

    while (i < N) {
        if (pattern[j] == text[i]) {
            j++;
            i++;
        }

        if (j == M) {
            cout << "Pattern found at index: " << (i - j) << endl;
            j = lps[j - 1];
        } else if (i < N && pattern[j] != text[i]) {
            if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }
}

int main() {
    char text[] = "The quick brown fox jumps over the lazy dog.";
    char pattern[] = "fox";

    KMPSearch(pattern, text);

    return 0;
}
