#include <iostream>

using namespace std;

struct Job {
    char id;
    int deadline;
    int profit;
};

void sorting(Job jobs[], int n) {
    Job temp;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (jobs[i].profit < jobs[j].profit) {
                temp = jobs[i];
                jobs[i] = jobs[j];
                jobs[j] = temp;
            }
        }
    }
}

void printJobSequence(Job jobs[], int n) {
    int result[n];
    bool slot[n] = {false};

    for (int i = 0; i < n; i++) {
        for (int j = min(n, jobs[i].deadline) - 1; j >= 0; j--) {
            if (!slot[j]) {
                result[j] = i;
                slot[j] = true;
                break;
            }
        }
    }

    cout << "Maximized profit job sequence: ";
    for (int i = 0; i < n; i++) {
        if (slot[i])
            cout << jobs[result[i]].id << " ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter the number of jobs: ";
    cin >> n;

    Job jobs[n];
    cout << "Enter job details (id, deadline, profit):" << endl;
    for (int i = 0; i < n; i++) {
        cin >> jobs[i].id >> jobs[i].deadline >> jobs[i].profit;
    }

    sorting(jobs, n);
    printJobSequence(jobs, n);

    return 0;
}
