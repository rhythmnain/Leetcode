class Solution 
{
    ArrayList<Integer>[] adj;
    boolean[] vis;
    int change;
  public int minReorder(int n, int[][] edges) {

    adj = new ArrayList[n];
    for (int i = 0; i < n; i++) {
        adj[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];
        adj[u].add(v);              // reorder
        adj[v].add(-u); 
    }

    vis = new boolean[n];
    change = 0;
    dfsm(0);

    return change;
  }

  public void dfsm(int u) {
    vis[u] = true;
    for (int v : adj[u]) {
        if (!vis[Math.abs(v)]) {
            if (v>0) change++;
            dfsm(Math.abs(v));
        }
    }
  }
}