package easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int nonValLastIndex = 0;
        int runnerIndex = 0;
        while (runnerIndex < nums.length) {
            if (nums[runnerIndex] != val) {
                swap(nums, nonValLastIndex, runnerIndex);
                nonValLastIndex++;
            }

            runnerIndex++;
        }

        return nonValLastIndex;
    }

    private void swap(int[] nums, int front, int end) {
        int tmp = nums[front];
        nums[front] = nums[end];
        nums[end] = tmp;
    }
}

