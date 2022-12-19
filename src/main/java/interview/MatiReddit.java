package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MatiReddit {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,6};
        System.out.println(checkDuplicate(arr));

        int[] arr2 = {1,2,3};
        System.out.println(Arrays.toString(twoSum(arr2, 4)));

    }

    //First problem: array. Check if a number inside the array is repeated.
    static int checkDuplicate(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : arr){
            if(!hashSet.add(num)){
                // If the element was already in the set, return true
                return num;
            }
        }
        return -1;
    }

    //Second problem: Check if inside the array there is the target number
    /**
     * Write a function that takes an array of numbers (integers for the tests) and a target number.
     * It should find two different items in the array that, when added together, give the target value.
     * The indices of these items should then be returned in a tuple / list (depending on your language)
     * like so: (index1, index2).
     * The input will always be valid (numbers will be an array of length 2 or greater, and all the items will be numbers;
     * target will always be the sum of two different items from that array).
     */

    static int[] twoSum(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                return new int[]{map.get(target - numbers[i]), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
    }
}
