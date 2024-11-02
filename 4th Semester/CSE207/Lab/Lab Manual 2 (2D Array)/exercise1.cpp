#include <iostream>

using namespace std;

int main() {
    int r1,c1,r2,c2;
    int ch;
    cout << "Enter First Array Row & Column: ";
    cin >> r1 >> c1;

    cout << "\nEnter Second Array Row & Column: ";
    cin >> r2 >> c2;

    int arr1[r1][c1],arr2[r2][c2];

    cout << "Enter Your First Array Elements: " << endl;

    for(int row=0; row<r1; row++) {
        for(int col=0; col<c1; col++) {
            cin >> arr1[row][col];
        }
    }

    cout << "Enter Your Second Array Elements: " << endl;

    for(int row=0; row<r2; row++) {
        for(int col=0; col<c2; col++) {
            cin >> arr2[row][col];
        }
    }
    cout << "Your First Array Elements: " << endl;

    for(int row=0; row<r1; row++) {
        for(int col=0; col<c1; col++) {
            cout << arr1[row][col] << " ";
        }
        cout << endl;
    }

    cout << "Your Second Array Elements: " << endl;

    for(int row=0; row<r2; row++) {
        for(int col=0; col<c2; col++) {
            cout << arr2[row][col] << " ";
        }
        cout << endl;
    }




    cout << "1) Add\n2) Subtract\n3) Multiply";
    cout << "\nEnter Your Choice: ";
    cin >> ch;

    switch(ch) {
    case 1 : {
        int total[r1][c1];
        for(int row=0; row<c1; row++) {
            for(int col=0; col<c1; col++) {
                total[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        cout << "Total is : " << endl;
        for(int row=0; row<r1; row++) {
            for(int col=0; col<c1; col++) {
                cout << total[row][col] << " ";
            }
            cout << endl;
        }
    }
    break;
    case 2 : {
        int total[r1][c1];
        for(int row=0; row<c1; row++) {
            for(int col=0; col<c1; col++) {
                total[row][col] = arr1[row][col] - arr2[row][col];
            }
        }

        cout << "Total is : " << endl;
        for(int row=0; row<r1; row++) {
            for(int col=0; col<c1; col++) {
                cout << total[row][col] << " ";
            }
            cout << endl;
        }
    }
    break;
    case 3 : {
        int total[r2][c2];
        for(int row=0; row<r2; row++) {
            for(int col=0; col<c2; col++) {
                total[row][col]=0;
                for(int k=0; k<c1; k++)  {
                    total[row][col] += (arr1[row][k] * arr2[k][col]);
                }
            }
        }

        cout << "Total is : " << endl;
        for(int row=0; row<r2; row++) {
            for(int col=0; col<c2; col++) {
                cout << total[row][col] << " ";
            }
            cout << endl;
        }
    }
    break;
    default:
        cout << "Invalid Input!";
    }
    return 0;
}
