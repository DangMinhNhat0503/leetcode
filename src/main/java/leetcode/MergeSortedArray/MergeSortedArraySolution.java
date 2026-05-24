package leetcode.MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        //Output: [1,2,2,3,5,6]
        //Input: nums1 = [1], m = 1, nums2 = [], n = 0
        //Output: [1]
        //Input: nums1 = [0], m = 0, nums2 = [1], n = 1
        //Output: [1]

        int j = 0;

        for (int i = m; i < n + m; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}
