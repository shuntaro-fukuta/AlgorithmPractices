package easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c: s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

}

