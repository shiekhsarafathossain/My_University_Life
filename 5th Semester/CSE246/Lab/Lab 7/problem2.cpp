#include <iostream>

using namespace std;

const int MAX_NODES = 100;

class Queue {
    int arr[MAX_NODES];
    int front, rear;
public:
    Queue() : front(0), rear(0) {}
    void push(int val) {
        arr[rear++] = val;
    }
    int pop() {
        return arr[front++];
    }
    bool empty() {
        return front == rear;
    }
};

bool bfs_check_bipartite(int graph[MAX_NODES][MAX_NODES], int n, int start, int color[]) {
    Queue q;
    color[start] = 0;
    q.push(start);

    while (!q.empty()) {
        int u = q.pop();
        for (int v = 0; v < n; ++v) {
            if (graph[u][v] == 1) {
                if (color[v] == -1) {
                    color[v] = 1 - color[u];
                    q.push(v);
                } else if (color[v] == color[u]) {
                    return false;
                }
            }
        }
    }
    return true;
}

bool is_bipartite(int graph[MAX_NODES][MAX_NODES], int n) {
    int color[MAX_NODES];
    for (int i = 0; i < n; ++i) {
        color[i] = -1;
    }

    for (int i = 0; i < n; ++i) {
        if (color[i] == -1) {
            if (!bfs_check_bipartite(graph, n, i, color)) {
                return false;
            }
        }
    }
    return true;
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

    if (is_bipartite(graph, n)) {
        cout << "Bipartite" << endl;
    } else {
        cout << "Not Bipartite" << endl;
    }

    return 0;
}
