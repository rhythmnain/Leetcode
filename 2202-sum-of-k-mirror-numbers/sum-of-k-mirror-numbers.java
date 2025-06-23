class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;

        while (count < n) {
            for (long p : generatePalindromes(length)) {
                if (isKPalindrome(p, k)) {
                    sum += p;
                    count++;
                    if (count == n) break;
                }
            }
            length++;
        }

        return sum;
    }

    private List<Long> generatePalindromes(int length) {
        List<Long> result = new ArrayList<>();
        int halfLen = (length + 1) / 2;
        long start = (long)Math.pow(10, halfLen - 1);
        long end = (long)Math.pow(10, halfLen);

        for (long i = start; i < end; i++) {
            String firstHalf = String.valueOf(i);
            String fullPal = (length % 2 == 0)
                ? firstHalf + new StringBuilder(firstHalf).reverse().toString()
                : firstHalf + new StringBuilder(firstHalf).reverse().substring(1);
            result.add(Long.parseLong(fullPal));
        }

        return result;
    }

    private boolean isKPalindrome(long num, int k) {
        String baseK = toBaseK(num, k);
        return isPalindrome(baseK);
    }

    private String toBaseK(long num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        return sb.reverse().toString();
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
