#include <stdio.h>

#define MAX_VERTICES 100

int main() {
    int adjacencyMatrix[MAX_VERTICES][MAX_VERTICES];
    int degrees[MAX_VERTICES];
    int numVertices, numEdges, i, j;
    int sumDegrees = 0, sumEdges = 0;

    printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);

    printf("Enter the adjacency matrix (%dx%d):\n", numVertices, numVertices);
    for (i = 0; i < numVertices; i++) {
        for (j = 0; j < numVertices; j++) {
            scanf("%d", &adjacencyMatrix[i][j]);
        }
    }

    printf("Graph Representation:\n");
    for (i = 0; i < numVertices; i++) {
        for (j = 0; j < numVertices; j++) {
            printf("%d ", adjacencyMatrix[i][j]);
        }
        printf("\n");
    }

    for (i = 0; i < numVertices; i++) {
        degrees[i] = 0;
        for (j = 0; j < numVertices; j++) {
            if (adjacencyMatrix[i][j] == 1) {
                degrees[i]++;
                if (i == j) { // Diagonal edge, increment degrees again
                    degrees[i]++;
                }
                if (i >= j) { // Consider only lower triangle (including diagonal)
                    sumEdges++;
                }
            }
        }
    }

    printf("Degrees of vertices:\n");
    for (i = 0; i < numVertices; i++) {
        printf("Vertex %d: %d\n", i, degrees[i]);
        sumDegrees += degrees[i];
    }

    printf("Total Degrees: %d\n", sumDegrees);
    printf("Total Edges: %d\n", sumEdges);

    if (sumDegrees == 2 * sumEdges) {
        printf("Handshaking rule holds true.\n");
    } else {
        printf("Error: Violation of the handshaking rule.\n");
    }

    return 0;
}
