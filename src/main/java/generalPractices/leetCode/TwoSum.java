package generalPractices.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] arr2 ={3,2,4};
        int[] arr3={3,3};
        System.out.println(Arrays.toString(twoSum(arr3, 6)));

    }
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{
                        map.get(target - nums[i]), i
                };
            }
            map.put(nums[i], i);
    }
        return new int[]{};
}
}
