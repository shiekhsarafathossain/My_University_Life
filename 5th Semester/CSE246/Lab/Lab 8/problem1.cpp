#include <iostream>
using namespace std;

const int MAX_NODES = 100;

void dfs(int graph[MAX_NODES][MAX_NODES], int n, int node, bool visited[], int result[], int &index) {
    visited[node] = true;
    result[index++] = node;

    for (int v = 0; v < n; ++v) {
        if (graph[node][v] == 1 && !visited[v]) {
            dfs(graph, n, v, visited, result, index);
        }
    }
}

int main() {
    int n, m;
    cin >> n >> m;

    int graph[MAX_NODES][MAX_NODES] = {0};

    for (int i = 0; i < m; ++i) {
        int u, v;
        cin >> u >> v;
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    int start_node;
    cout << "Starting node: ";
    cin >> start_node;

    bool visited[MAX_NODES] = { false };
    int result[MAX_NODES];
    int index = 0;

    dfs(graph, n, start_node, visited, result, index);

    for (int i = 0; i < index; ++i) {
        if (i != 0) cout << ", ";
        cout << result[i];
    }
    cout << endl;

    return 0;
}
