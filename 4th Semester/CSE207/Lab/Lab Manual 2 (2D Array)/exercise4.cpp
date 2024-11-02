#include <iostream>

using namespace std;

int main() {
    int r1,c1;

    cout << "Enter Array Row & Column: ";

    cin >> r1 >> c1;

    int arr1[r1][c1];
    int arr2[r1][c1];
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



    for(int row=0; row<r1; row++) {

        for(int col=0; col<c1; col++) {

            arr2[row][col] = arr1[col][row];

        }

    }

    cout << "Transpose of the matrix: " << endl;

    for(int row=0; row<r1; row++) {

        for(int col=0; col<c1; col++) {

            cout << arr2[row][col] << " ";

        }

        cout << endl;

    }

    return 0;

}
