#include <iostream>

using namespace std;

int main() {

    int r1,c1;
    cout << "Enter Array Row & Column: ";
    cin >> r1 >> c1;
    int arr1[r1][c1];

    cout << "Enter Your Array Elements: " << endl;
    for(int row=0; row<r1; row++) {

        for(int col=0; col<c1; col++) {

            cin >> arr1[row][col];

        }

    }

    cout << "Your Array Elements: " << endl;

    for(int row=0; row<r1; row++) {

        for(int col=0; col<c1; col++) {

            cout << arr1[row][col] << " ";

        }

        cout << endl;

    }

    int sum=1;

    for(int row=0; row<r1; row++) {

        for(int col=0; col<c1; col++) {

            if(row==col) {

                sum *= arr1[row][row];

            }

        }

    }

    if(sum==1) {

        cout << "It is an IDENTITY MATRIX";

    }

    else {

        cout << "It is not an IDENTITY MATRIX";

    }

    return 0;

}
