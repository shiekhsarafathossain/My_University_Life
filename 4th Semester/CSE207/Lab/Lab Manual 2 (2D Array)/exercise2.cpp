#include <iostream>

using namespace std;

int main() {
    int r1,c1;

    cout << "Enter Array Row & Column: ";

    cin >> r1 >> c1;

    int arr1[r1][c1];

    cout << "Enter Your First Array Elements: " << endl;

    for(int row=0; row<r1; row++) {

        for(int col=0; col<c1; col++) {

            cin >> arr1[row][col];

        }

    }

    cout << "Your Array Elements: " << endl;

    for(int row=0; row<3; row++) {

        for(int col=0; col<3; col++) {

            cout << arr1[row][col] << " ";

        }

        cout << endl;

    }


    for(int row=0; row<3; row++) {

        int sum=0;

        for(int col=0; col<3; col++) {

            sum = sum + arr1[row][col];

        }

        cout << "Row "<< row+1 << ": " << sum << endl;

    }

    for(int row=0; row<3; row++) {

        int sum2=0;

        for(int col=0; col<3; col++) {

            sum2 = sum2 + arr1[col][row];

        }

        cout << "Column "<< row+1 << ": " << sum2 << endl;

    }

    return 0;
}
