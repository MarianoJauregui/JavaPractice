package generalPractices.codewars.kyu8;

import java.util.Arrays;

public class CountByX {
    /*Create a function with two arguments that will return an array of the first (n) multiples of (x).
    Assume both the given number and the number of times to count will be positive numbers greater than 0. */

    public static int[] countBy(int n, int x) {
        int[] multipleArr = new int[n];
        for(int i=0; i<n; i++)
            multipleArr[i] = x*(i+1);
            return multipleArr;
    }

    public static int howOld(final String herOld){
        //This following regex removes all letters and spaces from the String
        String newString = herOld.replaceAll("[A-Za-z \\s]", "");
        //Then we parse the result into an int
        return Integer.parseInt(newString);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(10, 1)));
        System.out.println(howOld("5 years old"));
    }
}
