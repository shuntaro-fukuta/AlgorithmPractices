package easy;

public class NonZeroLast {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;

        int nonZeroLastIndex = 0;
        int runnerIndex = 0;
        while (runnerIndex < nums.length) {
            if (nums[runnerIndex] != 0) {
                swap(nums, nonZeroLastIndex, runnerIndex);
                nonZeroLastIndex++;
            }

            runnerIndex++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

