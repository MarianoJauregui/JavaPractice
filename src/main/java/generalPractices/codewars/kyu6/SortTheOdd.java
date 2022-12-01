package generalPractices.codewars.kyu6;

import java.util.Arrays;

/*
 * You will be given an array of numbers. You have to sort the odd numbers in ascending order
 * while leaving the even numbers at their original positions.
 */
public class SortTheOdd {
    public static void main(String[] args) {
        int[] arr = {5,8,6,3,4};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    public static int[] sortArray(int[] array) {
        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }
    }

