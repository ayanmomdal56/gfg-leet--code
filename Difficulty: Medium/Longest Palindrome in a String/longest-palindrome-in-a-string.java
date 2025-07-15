
class Solution {
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int maxLen = 1;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            int low = i - 1;
            int high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    start = low;
                    maxLen = high - low + 1;
                }
                low--;
                high++;
            }

            low = i;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    start = low;
                    maxLen = high - low + 1;
                }
                low--;
                high++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
