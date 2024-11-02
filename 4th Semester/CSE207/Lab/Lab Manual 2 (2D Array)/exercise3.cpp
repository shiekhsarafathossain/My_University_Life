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

    for(int row=0; row<3; row++) {

        for(int col=0; col<3; col++) {

            cout << arr1[row][col] << " ";

        }

        cout << endl;

    }

    for(int row=0; row<3; row++) {

        int max=arr1[0][row];

        for(int col=0; col<3; col++) {

            if(max < arr1[row][col]) {

                max = arr1[row][col];

            }

        }

        cout << "Row "<< row+1 << ": " << max << endl;

    }

    for(int row=0; row<3; row++) {

        int max = arr1[row][0];

        for(int col=0; col<3; col++) {

            if(max < arr1[col][row]) {

                max = arr1[col][row];

            }

        }

        cout << "Column "<< row+1 << ": " << max << endl;

    }

    return 0;

}
