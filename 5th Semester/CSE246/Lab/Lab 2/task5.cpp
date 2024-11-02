#include <iostream>

using namespace std;

void printJobSequence(int L[], int T[], int N) {
    int sequence[N];
    bool assigned[N] = {false};

    for (int i = 0; i < N; i++) {
        int maxLoss = INT_MAX;
        int jobIndex = -1;
        for (int j = 0; j < N; j++) {
            if (!assigned[j]) {
                int loss = L[j] * (i + 1) + T[j];
                if (loss < maxLoss) {
                    maxLoss = loss;
                    jobIndex = j;
                }
            }
        }
        sequence[i] = jobIndex + 1;
        assigned[jobIndex] = true;
    }

    cout << "Job sequence to minimize loss: ";
    for (int i = 0; i < N; i++) {
        cout << sequence[i] << " ";
    }
    cout << endl;
}

int main() {
    int N;
    cout << "Enter the number of jobs: ";
    cin >> N;

    int L[N], T[N];
    cout << "Enter losses (L) for each job: ";
    for (int i = 0; i < N; i++) {
        cin >> L[i];
    }
    cout << "Enter days required (T) for each job: ";
    for (int i = 0; i < N; i++) {
        cin >> T[i];
    }

    printJobSequence(L, T, N);

    return 0;
}
