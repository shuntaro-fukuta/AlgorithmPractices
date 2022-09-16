package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) return true;

            map.put(num, true);
        }

        return false;
    }
}

