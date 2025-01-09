// BFS
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (i!=0) {
                    return false;
                }
                bfs(rooms, vis, i);
            }
        }
        return true;
    }
    public void bfs(List<List<Integer>> rooms, boolean[] vis, int U) {
        Queue<Integer> q = new LinkedList<>();

        vis[U] = true;
        q.add(U);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : rooms.get(u)) {
                if (!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                }
            }
        }
    }
}