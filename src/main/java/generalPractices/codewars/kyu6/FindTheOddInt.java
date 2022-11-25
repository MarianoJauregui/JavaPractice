package generalPractices.codewars.kyu6;

import java.util.HashMap;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */
public class FindTheOddInt {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findIt(arr));

        System.out.println("Same solution but with XOR operator : " + findIt_USINGXOR(arr));
    }
    public static int findIt(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int num : arr){
            if(map.get(num) % 2 != 0)
                return num;
        }  return 0;
    }

    public static int findIt_USINGXOR(int[] arr){
        int xor = 0;
        for (int j : arr) {
            xor ^= j;
        }
        return xor;
    }
}
