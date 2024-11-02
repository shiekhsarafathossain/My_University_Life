#include <iostream>
#include <cmath>
using namespace std;

class Point
{
public:
    int x, y;
};



    return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));


const float FLT_MAX = 1e9;
float distance(Point p1, Point p2)
{
float bruteForce(Point P[], int n)
{
    float minDistance = FLT_MAX;
    for (int i = 0; i < n; ++i)
    {
        for (int j = i + 1; j < n; ++j)
        {
            float dist = distance(P[i], P[j]);
            if (dist < minDistance)
                minDistance = dist;
        }
    }
    return minDistance;
}

float closestUtil(Point P[], int n)
{
    if (n <= 3)
        return bruteForce(P, n);

    int mid = n / 2;
    Point midPoint = P[mid];

    float dl = closestUtil(P, mid);
    float dr = closestUtil(P + mid, n - mid);

    float d = min(dl, dr);

    Point strip[n];
    int j = 0;
    for (int i = 0; i < n; i++)
    {
        if (abs(P[i].x - midPoint.x) < d)
        {
            strip[j] = P[i];
            j++;
        }
    }

    float minStrip = d;
    for (int i = 0; i < j; ++i)
    {
        for (int k = i + 1; k < j && (strip[k].y - strip[i].y) < minStrip; ++k)
        {
            float dist = distance(strip[i], strip[k]);
            if (dist < minStrip)
                minStrip = dist;
        }
    }

    return min(d, minStrip);
}

float closest(Point P[], int n)
{
    return closestUtil(P, n);
}

int main()
{
    Point P[] = {{2, 3}, {12, 30}, {40, 50}, {5, 1}, {12, 10}, {3, 4}};
    int n = sizeof(P) / sizeof(P[0]);
    cout << "The smallest distance is " << closest(P, n);
    return 0;
}
