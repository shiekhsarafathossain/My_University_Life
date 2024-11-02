#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 700

int main()
{
    int i, j, n;

    printf("Enter The Dimension Of The Matrix: ");
    scanf("%d", &n);

    if(n > MAX_SIZE)
    {
        printf("Matrix size exceeds the maximum allowed size.\n");
        return 1;
    }

    srand(time(0));

    int mat[MAX_SIZE][MAX_SIZE];
    for(i = 0 ; i < n ; i++)
    {
        for(j = 0 ; j < n ; j++)
        {
            mat[i][j] = rand() % 2;
        }
    }

    printf("Matrix: \n");
    for(i = 0 ; i < n ; i++)
    {
        for(j = 0 ; j < n ; j++)
        {
            printf("%d ", mat[i][j]);
        }
        printf("\n");
    }

    struct timespec start_time, end_time;

    clock_gettime(CLOCK_MONOTONIC, &start_time);

    int symmetric = 1;
    for(i = 0 ; i < n ; i++)
    {
        for(j = 0 ; j < n ; j++)
        {
            if(mat[i][j] != mat[j][i])
            {
                symmetric = 0;
                break;
            }
        }
        if(symmetric == 0)
            break;
    }

    int anti_symmetric = 1;
    for(i = 0 ; i < n ; i++)
    {
        for(j = 0 ; j < n ; j++)
        {
            if(mat[i][j] == mat[j][i] && i != j)
            {
                anti_symmetric = 0;
                break;
            }
        }
        if(anti_symmetric ==0)
            break;
    }

    int transitive = 1;
    for(i = 0 ; i < n ; i++)
    {
        for(j = 0 ; j < n ; j++)
        {
            if(mat[i][j] == 1)
            {
                for(int k = 0 ; k < n ; k++)
                {
                    if(mat[j][k] == 1 && mat[i][k] != 1)
                    {
                        transitive = 0;
                        break;
                    }
                }
            }
        }
        if(transitive == 0)
            break;
    }

    int equivalence = symmetric && transitive;

    int function = 1;
    for(j = 0 ; j < n ; j++)
    {
        int count = 0;
        for(i = 0 ; i < n ; i++)
        {
            if(mat[i][j] == 1)
            {
                count++;
                if(count > 1)
                {
                    function = 0;
                    break;
                }
            }
        }
        if(function == 0)
            break;
    }

    clock_gettime(CLOCK_MONOTONIC, &end_time);

    double time_taken = (end_time.tv_sec - start_time.tv_sec) * 1000.0;
    time_taken += (end_time.tv_nsec - start_time.tv_nsec) / 1000000.0;

    printf("Symmetric: %s \n", symmetric ? "Yes" : "No");
    printf("Anti-Symmetric: %s \n", anti_symmetric ? "Yes" : "No");
    printf("Transitive: %s \n", transitive ? "Yes" : "No");
    printf("Equivalence: %s \n", equivalence ? "Yes" : "No");
    printf("Function: %s \n", function ? "Yes" : "No");
    printf("Execution time: %lf ms \n", time_taken);
    printf("\n");

    return 0;
}
