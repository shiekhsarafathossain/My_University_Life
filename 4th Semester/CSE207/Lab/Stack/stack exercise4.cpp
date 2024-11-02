#include <iostream>
using namespace std;

#define MAX_Size 100

void decimalToBinary(int decimal) {
    int stack[MAX_Size];
    int top = -1;

    while (decimal > 0) {
        stack[++top] = decimal % 2;
        decimal /= 2;
    }
    cout << "Binary representation: ";
    while (top >= 0) {
        cout << stack[top--];
    }
    cout << endl;
}

int main() {
    int decimal;

    cout << "Enter a decimal number: ";
    cin >> decimal;

    decimalToBinary(decimal);

    return 0;
}
