package leetcode.RemoveDuplicates;

public class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        //Input: nums = [0,0,1,1,1,2,2,3,3,4]
        //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
            if (nums.length == 0) {
                return 0;
            }

            int index = 1;

            for (int i = 1; i < nums.length; i++) {

                if (nums[i] != nums[i - 1]) {
                    nums[index] = nums[i];
                    index++;
                }
            }

            return index;
        }
}
