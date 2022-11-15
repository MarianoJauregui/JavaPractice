package generalPractices.codewars.kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task
 * Given a list of numbers, return a fixed list so that the values increment by 1 for each index
 * from the minimum value up to the maximum value (both included).
 * Example
 * Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8
 */
public class Pipes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9};
        System.out.println(Arrays.toString(pipeFixArray(arr)));
    }

    public static int[] pipeFixArray(int[] numbers){
        int minValue = numbers[0]; // 1
        int maxValue = numbers[numbers.length-1]; // 9
        int size = maxValue - minValue +1; // 9 - 1 + 1

        int[] array = new int[size];

        for (int i=0; i < size; i++){
            array[i] = i + minValue;
        }
        return array;
    }

    public static List<Integer> pipeFix(int[] numbers) {

        int minValue = numbers[0];
        int maxValue = numbers[numbers.length-1];
        List<Integer> integerList = new ArrayList<>();

        for(int i = minValue; i<=maxValue; i++){
            integerList.add(i);
        }

        return integerList;
    }


}
