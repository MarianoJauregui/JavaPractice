package generalPractices.codewars.kyu8;

import java.util.Arrays;


public class WhatIsBetween {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(5, 10)));
        System.out.println(Arrays.toString(between2(5, 10)));
    }
    /*
    Complete the function that takes two integers (a, b, where a < b)
     and return an array of all integers between the input parameters, including them.
     */
    public static int[] between(int a, int b){
        int[] newArray = new int[b - a + 1];
        for(int i=a; i<=b; i++){
            newArray[i-a] = i;
        }
        return newArray;
    }

    //simpler solution
    public static int[] between2(int a, int b){
        return java.util.stream.IntStream.rangeClosed(a, b).toArray();
    }
}
