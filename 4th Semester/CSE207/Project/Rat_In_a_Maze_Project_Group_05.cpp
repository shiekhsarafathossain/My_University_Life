#include <iostream>
#include <random>
#include <ctime>

using namespace std;

bool isSafe(int x, int y, int N, int maze[][20])
{
    return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
}

bool ratInMaze(int N, int x, int y, int maze[][20], int sol[][20])
{
    if (isSafe(x, y, N, maze))
    {
        if (x == N - 1 && y == N - 1)
        {
            sol[x][y] = 1;
            return true;
        }

        sol[x][y] = 1;

        if (ratInMaze(N, x + 1, y, maze, sol))
            return true;

        if (ratInMaze(N, x, y + 1, maze, sol))
            return true;

        sol[x][y] = 0;
        return false;
    }

    return false;
}

void printSolution(int N, int sol[][20])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
            cout << " " << sol[i][j] << " ";
        cout << endl;
    }
}

int main()
{
    srand(time(NULL));

    int N, choice;

    do
    {
        cout << "Enter square matrix value (N x N): ";
        cin >> N;

        int givenMaze[20][20];
        int solMaze[20][20];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                solMaze[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                givenMaze[i][j] = rand() % 2; // 0 or 1
            }
        }

        if (ratInMaze(N, 0, 0, givenMaze, solMaze) == false)
        {
            cout << endl << endl << "Given Maze" << endl;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                    cout << " " << givenMaze[i][j] << " ";
                cout << endl;
            }
            cout << endl << endl << "Solution Does Not Exist" << endl << endl;

            cout << endl << endl << "Do you want to try again?" << endl;
            cout << "1.Yes" << endl;
            cout << "0.Exit" << endl << endl;
            cout << "Enter your choice: ";
            cin >> choice;

            if (choice == 1)
            {
                system("cls"); // Clear screen (for Windows)
            }
        }
        else
        {
            cout << endl << endl << "Given Maze" << endl;
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                    cout << " " << givenMaze[i][j] << " ";
                cout << endl;
            }
            cout << endl << endl << "The rat found its way" << endl;
            printSolution(N, solMaze);

            cout << endl << endl << "Do you want to try again?" << endl;
            cout << "1.Yes" << endl;
            cout << "0.Exit" << endl << endl;
            cout << "Enter your choice: ";
            cin >> choice;

            if (choice == 1)
            {
                system("cls"); // Clear screen (for Windows)
            }
        }
    }
    while (choice != 0);

    return 0;
}
