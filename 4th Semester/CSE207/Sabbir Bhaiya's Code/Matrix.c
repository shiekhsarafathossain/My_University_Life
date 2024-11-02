#include <stdio.h>
int main() {
    int choice, n,m, i, j, k, arr1[100][100], arr2[100][100];

    while (1) {
        printf("1.Matrix Add\n2.Matrix Subtraction\n3.Matrix Multiplication\n4.Diagonal Element Add\n5.Exit\nEnter Your Choice:");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Enter the size of the matrix (n x n): ");
            scanf("%d", &n);

            printf("Enter the elements of the first matrix:\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    scanf("%d", &arr1[i][j]);
                }
            }

            printf("Enter the elements of the second matrix:\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    scanf("%d", &arr2[i][j]);
                }
            }

            printf("The sum of the two matrices is:\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    printf("%d ", arr1[i][j] + arr2[i][j]);
                }
                printf("\n");
            }
        }
        else if (choice == 2) {
            printf("Enter the size of the matrix (n x n): ");
            scanf("%d", &n);

            printf("Enter the elements of the first matrix:\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    scanf("%d", &arr1[i][j]);
                }
            }

            printf("Enter the elements of the second matrix:\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    scanf("%d", &arr2[i][j]);
                }
            }

            printf("The difference of the two matrices is:\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    printf("%d ", arr1[i][j] - arr2[i][j]);
                }
                printf("\n");
            }
        }
        else if (choice == 3) {
                printf("Enter the size of the first matrix (m x n): ");
scanf("%d %d", &m, &n);

printf("Enter the elements of the first matrix:\n");
for (i = 0; i < m; i++) {
    for (j = 0; j < n; j++) {
        scanf("%d", &arr1[i][j]);
    }
}

printf("Enter the size of the second matrix (n x p): ");
int p;
scanf("%d %d", &n, &p);
if (n != n) {
    printf("Error: The number of columns of the first matrix must be equal to the number of rows of the second matrix.\n");
    return 0;
}

printf("Enter the elements of the second matrix:\n");
for (i = 0; i < n; i++) {
    for (j = 0; j < p; j++) {
        scanf("%d", &arr2[i][j]);
    }
}

int res[m][p];
for (i = 0; i < m; i++) {
    for (j = 0; j < p; j++) {
        res[i][j] = 0;
        for (k = 0; k < n; k++) {
            res[i][j] += arr1[i][k] * arr2[k][j];
        }
    }
}

printf("The product of the two matrices is:\n");
for (i = 0; i < m; i++) {
    for (j = 0; j < p; j++) {
        printf("%d ", res[i][j]);
    }
    printf("\n");
}

    }
    else if (choice == 4) {
        printf("Enter the size of the matrix (n x n): ");
        scanf("%d", &n);

        printf("Enter the elements of the matrix:\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                scanf("%d", &arr1[i][j]);
            }
        }

        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += arr1[i][i];
        }

        printf("The sum of the diagonal elements is: %d\n", sum);
    }
    else if (choice == 5) {
        break;
    }
    else {
        printf("Invalid Input\n");
    }
}

return 0;
}
