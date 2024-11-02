#include <iostream>

using namespace std;

// Function to compute the factorial of a number using the divide and conquer approach
int factorial(int n) {
    // Base case
    	if (n == 0)
            return 1;
    	else
            return n * factorial(n-1);
}

int main() {
    int n = 5;

    cout << "Factorial of " << n << " is " << factorial(n) << endl;

    return 0;
}
