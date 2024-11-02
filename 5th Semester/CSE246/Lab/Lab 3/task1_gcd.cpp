#include <iostream>
using namespace std;

int gcd(int a, int b){
    if(a == 0){
        return b;
    }
    else{
        return gcd(b%a,a);
    }
}

int main(){
    int a,b;

    cout << "Enter first number: ";
    cin >> a;
    cout << "Enter second number: ";
    cin >> b;

    cout << "GCD of the two numbers using Euclid's algorithm: " << gcd(a,b);

    return 0;
}
