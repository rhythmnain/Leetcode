class Solution {
    public int maxPoints(int[][] points) {
        int max = 1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                max = Math.max(max, countPoints(i, j, points));
            }
        }
        return max;
    }

    private int countPoints(int p1Index, int p2Index, int[][] points) {
        int[] p1 = points[p1Index];
        int[] p2 = points[p2Index];
        int cnt = 0;
        for (int i = 0; i < points.length; i++) {
            int[] p3 = points[i];
            if (i == p1Index || i == p2Index || (p1[0] - p2[0]) * (p2[1] - p3[1]) == (p2[0] - p3[0]) * (p1[1] - p2[1])) {
                cnt++;
            }
        }
        return cnt;
    }
}