#include <iostream>

using namespace std;

bool isPrime(int num) {
    if (num <= 1) return false;
    if (num <= 3) return true;
    if (num % 2 == 0 || num % 3 == 0) return false;
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) return false;
    }
    return true;
}

int highestOccurringDigitInRange(int L, int R) {
    int digitFreq[10] = {0};
    int maxFreq = 0;
    int result = -1;

    for (int num = L; num <= R; ++num) {
        if (isPrime(num)) {
            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                digitFreq[digit]++;
                if (digitFreq[digit] > maxFreq) {
                    maxFreq = digitFreq[digit];
                    result = digit;
                } else if (digitFreq[digit] == maxFreq && digit > result) {
                    result = digit;
                }
                temp /= 10;
            }
        }
    }

    return result;
}

int main() {
    int L, R;
    cout << "Enter the range L and R: ";
    cin >> L >> R;
    int result = highestOccurringDigitInRange(L, R);
    if (result != -1)
        cout << "Highest occurring digit in prime numbers between " << L << " and " << R << " is: " << result << endl;
    else
        cout << "No prime numbers found between " << L << " and " << R << "." << endl;
    return 0;
}
