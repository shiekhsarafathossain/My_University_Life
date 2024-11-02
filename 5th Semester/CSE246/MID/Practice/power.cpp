#include <iostream>

using namespace std;

// Function to compute x^y using the divide and conquer approach
double power(double x, int y) {
    // Base cases
    if (y == 0) return 1;
    if (y == 1) return x;

    // Recursive cases
    double temp = power(x, y / 2);
    if (y % 2 == 0) {
        return temp * temp;
    } else {
        return x * temp * temp;
    }
}

int main() {
    double x = 2;
    int y = 5;

    cout << x << " raised to the power of " << y << " is " << power(x, y) << endl;

    return 0;
}
