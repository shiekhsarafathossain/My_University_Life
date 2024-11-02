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

void bfs(int graph[MAX_NODES][MAX_NODES], int n, int source) {
    bool visited[MAX_NODES] = { false };
    int distance[MAX_NODES];
    int parent[MAX_NODES];

    for (int i = 0; i < n; ++i) {
        distance[i] = -1;
        parent[i] = -1;
    }

    Queue q;
    visited[source] = true;
    distance[source] = 0;
    q.push(source);

    while (!q.empty()) {
        int u = q.pop();
        for (int v = 0; v < n; ++v) {
            if (graph[u][v] == 1 && !visited[v]) {
                visited[v] = true;
                distance[v] = distance[u] + 1;
                parent[v] = u;
                q.push(v);
            }
        }
    }

    for (int i = 0; i < n; ++i) {
        if (i == source) continue;
        if (distance[i] == -1) {
            cout << "Path 0 to " << i << ": Unreachable\n";
        } else {
            cout << "Path 0 to " << i << ": ";
            int path[MAX_NODES];
            int count = 0;
            for (int v = i; v != -1; v = parent[v]) {
                path[count++] = v;
            }
            for (int j = count - 1; j >= 0; --j) {
                if (j != count - 1) cout << "->";
                cout << path[j];
            }
            cout << " Cost: " << distance[i] << endl;
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

    int source;
    cout << "Source node: ";
    cin >> source;

    bfs(graph, n, source);

    return 0;
}
