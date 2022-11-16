package generalPractices.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except one.
 * Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,3,3,5,7,7};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber2(arr));
        System.out.println(0^2^1^1^1^3^3^3^4^4);
    }



    public static int singleNumber(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static int singleNumber2(int[] arr){
        Arrays.sort(arr);
        if(arr.length == 1) return arr[0];

        for(int i=1; i < arr.length; i+=2){
            if(arr[i] != arr[i-1]){
                return arr[i-1];
            }
        }
        return arr[arr.length -1];
    }

    public static int singleNumberEnhancedFor(int[] arr){
        /**
         * Properties of XOR:
         *         It returns the same number if weXOR with zero.
         *     It returns zero if we take XOR of two same numbers.
         *     So We can XOR all the numbers in the given input, as per XOR properties;
         *     all the duplicate number will zero out each other, and we will be left with single number.
         */
        int num = 0;
        for(int i : arr){
            num = num ^ i;
        }
        return num;
    }

    public static int singleNumberWithHashMap(int[] arr){
/**
 *         Maintain Hashmap and check the count against array and return the elements
 *         if we found the one as a value,
 *         Since there is only one unique element as soon as we get value as 1
 *         we return that element.
 */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        for(int i : arr){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
