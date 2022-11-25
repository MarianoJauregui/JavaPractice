package generalPractices.codewars.kyu6;

import java.util.Arrays;

/**
 * Well met with Fibonacci bigger brother, AKA Tribonacci.
 * As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next.
 * So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:
 * [1, 1 ,1, 3, 5, 9, 17, 31, ...]
 */
public class Tribonacci {
    public static void main(String[] args) {
        double[] arr = {1,1,1};
        System.out.println(Arrays.toString(tribonacci(arr, 10)));
    }
    public static double[] tribonacci(double[] s, int n){


        double[] tribonacci = Arrays.copyOf(s, n);
        for(int i = 3; i<n; i++){
            tribonacci[i] = tribonacci[i-1]+tribonacci[i-2]+tribonacci[i-3];
        }
        return tribonacci;
    }
}
