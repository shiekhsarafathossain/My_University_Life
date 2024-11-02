#include <iostream>

#define MAX_SIZE 100

int main() {
    char data[MAX_SIZE];
    char stack[MAX_SIZE];
    int top = -1;

    std::cout << "Enter a string with parentheses: ";
    std::cin.getline(data, MAX_SIZE);

    for (int i = 0; data[i] != '\0'; i++) {
        if (data[i] == '(') {
            stack[++top] = '(';
        } else if (data[i] == ')') {
            if (top == -1 || stack[top] != '(') {
                std::cout << "Closing parentheses not matched" << std::endl;
                return 0;
            }
            top--;
        }
    }

    if (top != -1) {
        std::cout << "Opening parentheses not matched" << std::endl;
    } else {
        std::cout << "All parentheses are well-paired" << std::endl;
    }

    return 0;
}
