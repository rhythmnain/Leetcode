class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){
            sb.append(new StringBuilder(arr[i]).reverse());
            if(i!= n-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}