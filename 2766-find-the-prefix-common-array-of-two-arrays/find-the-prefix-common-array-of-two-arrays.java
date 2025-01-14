class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];
        int[] occur = new int[n+1];
        int count=0;
        for(int i=0; i<n; i++){
            if(++occur[A[i]]==2) count++;
            if(++occur[B[i]]==2) count++;
            result[i] = count;
        }
        return result;
    }
}
