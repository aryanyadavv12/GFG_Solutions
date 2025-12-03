import java.util.*;

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Step 1: Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]); // undirected graph
        }

        // Step 2: Track visited nodes
        boolean[] visited = new boolean[V];

        // Step 3: Check each component via DFS
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) {
                    return true; // cycle detected
                }
            }
        }

        return false; // no cycle in any component
    }

    // DFS helper: returns true if cycle is found
    private boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) return true;
            } else if (neighbor != parent) {
                // Visited node that's not the parent → cycle
                return true;
            }
        }

        return false;
    }
}

