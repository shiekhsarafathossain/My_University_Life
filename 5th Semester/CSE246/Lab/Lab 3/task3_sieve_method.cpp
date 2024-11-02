#include <iostream>

using namespace std;

void sieveOfEratosthenes(int n) {
    bool prime[n+1];
    for(int i = 0; i <= n; ++i) {
        prime[i] = true;
    }

    for(int p = 2; p*p <= n; ++p) {
        if(prime[p] == true) {
            for(int i = p*p; i <= n; i += p) {
                prime[i] = false;
            }
        }
    }

    for(int p = 2; p <= n; ++p) {
        if(prime[p]) {
            cout << p << " ";
        }
    }
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << "Prime numbers smaller than or equal to " << n << " are: ";
    sieveOfEratosthenes(n);
    cout << endl;
    return 0;
}
