#include <iostream>
#include <cmath> // Only for abs function

using namespace std;

// Struct to represent a point in 2D space
struct Point {
    int x, y;
};

// Function to calculate the Euclidean distance between two points
double dist(Point p1, Point p2) {
    return sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
}

// Function to compare points based on their x-coordinates
bool compareX(Point p1, Point p2) {
    return p1.x < p2.x;
}

// Function to compare points based on their y-coordinates
bool compareY(Point p1, Point p2) {
    return p1.y < p2.y;
}

double bruteForceClosestPair(Point P[], int n) {
    double minDist = n; // Initialize with maximum possible distance
    for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
            double distance = dist(P[i], P[j]);
            if (distance < minDist) {
                minDist = distance;
            }
        }
    }
    return minDist;
}

// Function to find the closest pair of points
double closestPairOfPoints(Point P[], int n);

int main() {
    Point P[] = {{2, 3}, {12, 30}, {40, 50}, {5, 1}, {12, 10}, {3, 4}};
    int n = sizeof(P) / sizeof(P[0]);
    cout << "The closest distance between two points is: " << closestPairOfPoints(P, n) << endl;
    return 0;
}

// Function to find the closest pair of points
double closestPairOfPoints(Point P[], int n) {
    if (n <= 3) {
         return bruteForceClosestPair(P, n);
        // Apply brute force method here
        // return result;
    }

    // Sort the points based on their x-coordinates
    for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
            if (P[i].x > P[j].x) {
                swap(P[i], P[j]);
            }
        }
    }

    // Find the middle point
    int mid = n / 2;
    Point midPoint = P[mid];

    // Divide the points into two halves
    Point left[mid], right[n - mid];
    for (int i = 0; i < mid; i++) left[i] = P[i];
    for (int i = mid; i < n; i++) right[i - mid] = P[i];

    // Recursively find the closest pair of points in each half
    double dl = closestPairOfPoints(left, mid);
    double dr = closestPairOfPoints(right, n - mid);

    // Find the minimum distance between points in the two halves
    double d = min(dl, dr);

    // Create an array to store the points within the strip of width 2d centered at the middle point
    Point strip[n];
    int j = 0;
    for (int i = 0; i < n; i++) {
        if (abs(P[i].x - midPoint.x) < d) {
            strip[j] = P[i];
            j++;
        }
    }

    // Sort the points in the strip based on their y-coordinates
    for (int i = 0; i < j; ++i) {
        for (int k = i + 1; k < j; ++k) {
            if (strip[i].y > strip[k].y) {
                swap(strip[i], strip[k]);
            }
        }
    }

    // Check for points in the strip that are closer than d
    for (int i = 0; i < j; i++) {
        for (int k = i + 1; k < j && (strip[k].y - strip[i].y) < d; k++) {
            d = min(d, dist(strip[i], strip[k]));
        }
    }

    return d;
}
