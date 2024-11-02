#include <iostream>
using namespace std;

#define MAX_SIZE 100

bool isValid(char *data)
{
    char stack[MAX_SIZE];
    int top = -1;

    for (int i = 0; data[i] != '\0'; i++)
    {
        if (data[i] == '(' || data[i] == '{' || data[i] == '[')
        {
            stack[++top] = data[i];
        }
        else
        {
            if (top == -1 || (data[i] == ')' && stack[top] != '(') || (data[i] == '}' && stack[top] != '{') || (data[i] == ']' && stack[top] != '['))
            {
                return false;
            }
            top--;
        }
    }
    return (top == -1);
}

int main()
{
    char data[MAX_SIZE];

    cout << "Enter a string containing only parentheses: ";
    cin >> data;

    if (isValid(data))
    {
        cout << "The parentheses are valid\n";
    }
    else
    {
        cout << "The parentheses are invalid\n";
    }

    return 0;
}
