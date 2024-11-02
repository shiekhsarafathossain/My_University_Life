#include <iostream>
using namespace std;

#define MAX 100

int graph[MAX][MAX];
int numVertices, numEdges;
bool visited[MAX];
int discovery[MAX], low[MAX], parent[MAX];
bool articulationPoints[MAX];
int timeCounter;

void dfs(int u) {
    int children = 0;
    visited[u] = true;
    discovery[u] = low[u] = ++timeCounter;

    for (int v = 0; v < numVertices; v++) {
        if (graph[u][v]) {
            if (!visited[v]) {
                children++;
                parent[v] = u;
                dfs(v);

                low[u] = min(low[u], low[v]);

                if (parent[u] == -1 && children > 1) {
                    articulationPoints[u] = true;
                }
                if (parent[u] != -1 && low[v] >= discovery[u]) {
                    articulationPoints[u] = true;
                }
            } else if (v != parent[u]) {
                low[u] = min(low[u], discovery[v]);
            }
        }
    }
}

void findArticulationPoints() {
    for (int i = 0; i < numVertices; i++) {
        visited[i] = false;
        parent[i] = -1;
        articulationPoints[i] = false;
    }

    timeCounter = 0;

    for (int i = 0; i < numVertices; i++) {
        if (!visited[i]) {
            dfs(i);
        }
    }

    for (int i = 0; i < numVertices; i++) {
        if (articulationPoints[i]) {
            cout << i << endl;
        }
    }
}

int main() {
    cin >> numVertices >> numEdges;

    for (int i = 0; i < numEdges; i++) {
        int u, v;
        cin >> u >> v;
        graph[u][v] = 1;
        graph[v][u] = 1; // Since the graph is undirected
    }

    findArticulationPoints();

    return 0;
}
