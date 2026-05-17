package leetcode.RemoveElement;

public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        //Input: nums = [3,2,2,3], val = 3
        //Output: 2, nums = [2,2,_,_]
        int length = nums.length;

        int index = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
