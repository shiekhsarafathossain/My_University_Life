#include <iostream>

using namespace std;

int main()
{
    int size, top=-1;
    cout << "Enter Stack Size: ";
    cin >> size;
    int stack[size];



    int loop=1;
    while(loop)
    {
        int opt;
        cout << "1.Push stack\n";
        cout << "2.Print stack\n";
        cout << "3.Pop stack\n";
        cout << "4.Exit\n";
        cin >> opt;
        switch(opt)
        {
        case 1:
            int data;
            cout << "Enter Element: ";
            cin >> data;
            if(top == size-1)
            {
                cout << "Stack Full" << endl;
            }
            else
            {
                top++;
                stack[top] = data;
                break;
            }
            loop=1;
            break;


        case 2:
            if(top<0)
            {
                cout << "Stack is Empty\n";
            }

            else
            {
                for(int i=top; i>=0; i--)
                {
                    cout << stack[i] << " ";
                }
                cout << endl;
            }

            loop=1;
            break;

        case 3:
            if(top==-1)
            {
                cout << "Stack already empty\n";
            }
            else
            {
                stack[top] = 0;
                top--;
            }
            break;

        case 4:
            loop = 0;
            break;

        default:
            cout << "Invalid Input\n";
            loop=1;
            break;
        }
    }


}

