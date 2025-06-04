class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) return word;

        String maxP1 = "";

        int maxLength = word.length() - numFriends + 1;

        for (int i = 0; i < word.length(); i++) {
            String temp;

            if (i + maxLength <= word.length()) {
                temp = word.substring(i, i + maxLength);
            } else {
                temp = word.substring(i);
            }

            if (temp.compareTo(maxP1) > 0) {
                maxP1 = temp;
            }
        }

        return maxP1;
    }
}