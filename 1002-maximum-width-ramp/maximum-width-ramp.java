class Solution {
    private int binSearch(int left, int right, int target, int[] a) {
        if (left >= right) return right;
        int mid = left + (right - left) / 2;
        return a[mid] >= target ? binSearch(mid + 1, right, target, a) : binSearch(left, mid, target, a);
    }

    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], nums[i]);
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, binSearch(i + 1, n, nums[i], suffix) - 1 - i);
        }
        return ans;
    }
}