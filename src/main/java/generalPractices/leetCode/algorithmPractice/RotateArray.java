package generalPractices.leetCode.algorithmPractice;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        rotate(arr, 3);
    }
    /*
        I could not solve this problem. I have to look for the solution.
     */

    public static void rotate(int[] nums, int steps) {
        steps %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, steps - 1);
        reverse(nums, steps, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
