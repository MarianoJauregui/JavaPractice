package generalPractices.leetCode.algorithmPractice;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */

public class SquaresOfSortedArray {
    static int[] arr = {-4,-1,0,3,10};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(arr)));

        System.out.println(Arrays.toString(fasterSortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i]*=nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }

    public static int[] fasterSortedSquares(int[] nums){
        if(nums == null || nums.length == 0)
            return null;
        int left = 0;
        int right = nums.length -1;
        int[] result = new int[nums.length];
        int index = nums.length -1;

        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                result[index] = nums[right];// * nums[right]; esto estaba en la solución pero me lo eleva nuevamente a la potencia
                right--;
            } else {
                result[index] = nums[left]; //* nums[left];
                left++;
            }
            index--;
        }
        return result;
    }
}
