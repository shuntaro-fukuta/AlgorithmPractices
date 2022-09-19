package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> appearedCharIndexes = new HashMap<>();

        int maxLength = 0;
        int substringStartIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (appearedCharIndexes.containsKey(ch) && appearedCharIndexes.get(ch) >= substringStartIndex) {
                substringStartIndex = appearedCharIndexes.get(ch) + 1;
            }

            int tmpSubstringLength = i - substringStartIndex + 1;
            if (tmpSubstringLength > maxLength) {
                maxLength = tmpSubstringLength;
            }

            appearedCharIndexes.put(ch, i);
        }

        return maxLength;
    }
}

