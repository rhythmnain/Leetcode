class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];

        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int end_ptr = 0, group_count = 0;

        for (int start : startTimes) {
            if (start > endTimes[end_ptr]) {
                end_ptr++;
            } else {
                group_count++;
            }
        }

        return group_count;
    }
}