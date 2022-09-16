package easy;

// https://leetcode.com/problems/two-sum/

class AddTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        return new int[] {index1, index2};
    }
}

