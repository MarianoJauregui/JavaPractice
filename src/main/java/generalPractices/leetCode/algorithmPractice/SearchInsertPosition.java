package generalPractices.leetCode.algorithmPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        System.out.println(searchInsert(nums, 9));
    }

    public static int searchInsert(int[] nums, int target){

        int first = 0;
        int last = nums.length -1;

        while (first <= last){
            int middle = (first + last) / 2;
            if(nums[middle] == target) return middle;

             else if (nums[middle] > target) last = middle - 1 ;

             else first = middle + 1;
        }
        return first;
    }
}
