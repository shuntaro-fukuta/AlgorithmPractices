package medium;

// https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromic {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abb"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        String longestPalindrome = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String palindrome = getPalindrome(s, i, i+1);
            if (palindrome.length() > longestPalindrome.length()) {
                longestPalindrome = palindrome;
            }

            palindrome = getPalindrome(s, i, i);
            if (palindrome.length() > longestPalindrome.length()) {
                longestPalindrome = palindrome;
            }
        }

        return longestPalindrome;
    }

    public static String getPalindrome(String s, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < s.length()
                 && s.charAt(leftIndex) == s.charAt(rightIndex)) {
                    leftIndex--;
                    rightIndex++;
                }

        return s.substring(leftIndex + 1, rightIndex);
    }
}

