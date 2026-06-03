package leetcode.SingleNumber;

public class SingleNumberSolution {
    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        for (int num : nums) {
            int count = 0;

            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }
}
