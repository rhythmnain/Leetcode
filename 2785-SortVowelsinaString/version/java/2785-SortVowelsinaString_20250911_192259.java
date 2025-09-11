// Last updated: 9/11/2025, 7:22:59 PM
class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[128];
        boolean[] isVowel = new boolean[128];

        String vowels = "aeiouAEIOU";
        for (char v : vowels.toCharArray()) {
            isVowel[v] = true;
        }

        for (char c : s.toCharArray()) {
            if (isVowel[c]) {
                freq[c]++;
            }
        }

        String order = "AEIOUaeiou";
        int pos = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (isVowel[arr[i]]) {
                while (pos < order.length() && freq[order.charAt(pos)] == 0) {
                    pos++;
                }
                arr[i] = order.charAt(pos);
                freq[order.charAt(pos)]--;
            }
        }

        return new String(arr);
    }
}