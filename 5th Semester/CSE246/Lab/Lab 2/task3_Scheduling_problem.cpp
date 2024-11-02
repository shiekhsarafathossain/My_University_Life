#include <iostream>
using namespace std;
void sorting(float arrival[], float departure[], int n) {
    float temp = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (departure[i] > departure[j]) {
                temp = departure[i];
                departure[i] = departure[j];
                departure[j] = temp;

                temp = arrival[i];
                arrival[i] = arrival[j];
                arrival[j] = temp;
            }
        }
    }
}

int minPlatforms(float arrival[], float departure[], int n) {
    sorting(arrival, departure, n);
    int platforms = 1, maxPlatforms = 1;
    int i = 1, j = 0;
    while (i < n && j < n) {
        if (arrival[i] <= departure[j]) {
            platforms++;
            i++;
            if (platforms > maxPlatforms)
                maxPlatforms = platforms;
        } else {
            platforms--;
            j++;
        }
    }
    return maxPlatforms;
}

int main() {
    int n;
    cout << "Enter number of schedules: ";
    cin >> n;

    float arrival[n], departure[n];
    cout << "Enter Arrival: ";
    for (int i = 0; i < n; i++) {
        cin >> arrival[i];
    }
    cout << "Enter Departure: ";
    for (int i = 0; i < n; i++) {
        cin >> departure[i];
    }

    int minPlatformsNeeded = minPlatforms(arrival, departure, n);
    cout << "Minimum number of platforms needed: " << minPlatformsNeeded << endl;

    return 0;
}
