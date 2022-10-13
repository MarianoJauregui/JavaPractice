package generalPractices.codewars;
/*
    Given an array of integers.
    Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
    If the input is an empty array or is null, return an empty array.

    Example
    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */

import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] arr2 = {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        int[] arr3 = {0,0,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr3)));
    }
    public static int[] countPositivesSumNegatives(int[] input){
        if(input.length == 0) return new int[]{};

        int countPositive = 0;
        int sumNegatives = 0;

        for (int j : input) {
            if (j > 0) countPositive++;
            if (j < 0) sumNegatives += j;
        }
        return new int[]{countPositive, sumNegatives};
    }
}
