package generalPractices.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresOfSortedArray {
    static int[] arr = {16,1,0,9,100};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i]*=nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }
}
