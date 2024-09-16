import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        // Convert timePoints to minutes since start of day
        int[] mins = new int[timePoints.size()];
        for(int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            int hr = Integer.parseInt(time.substring(0, 2));
            int mn = Integer.parseInt(time.substring(3, 5));
            mins[i] = hr * 60 + mn;
        } 

        // Sort the array of minutes
        Arrays.sort(mins);

        // Initialize minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;

        // Find minimum difference between consecutive elements
        for(int i = 0; i < mins.length - 1; i++) {
            minDiff = Math.min(minDiff, mins[i + 1] - mins[i]);
        }

        // Also consider the difference between the last and first element (taking the day boundary into account)
        minDiff = Math.min(minDiff, 24 * 60 - mins[mins.length - 1] + mins[0]);

        return minDiff;
    }
}
