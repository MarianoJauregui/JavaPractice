package generalPractices.codewars.kyu8;

import java.util.Arrays;

/*
Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.
 */
public class EnumerableMagic {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(take(arr, 3)));
    }

    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr).limit(n).toArray();

    }
}
