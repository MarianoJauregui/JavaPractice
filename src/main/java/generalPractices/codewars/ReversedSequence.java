package generalPractices.codewars;

import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(reverse(10)));
    }
    static int[] reverse(int n){
        int[] array = new int[n];
        for(int i=0; i< array.length; i++){
            array[i] = n;
            n = n-1;
        }
        return array;
    }
}
