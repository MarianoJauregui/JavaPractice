package generalPractices.codewars;
/**
 * This kata is from check py.checkio.org
 *
 * You are given an array with positive numbers and a non-negative number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.
 *
 * Let's look at a few examples:
 *
 * array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
 * array = [1, 2, 3] and N = 3, but N is outside the array, so the result is -1.
 */
public class NthPower {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(nthPower(arr, 2));

    }


    public static int nthPower(int[] array, int n) {
            if (n > array.length -1) return -1;
            else return (int) Math.pow(array[n], n);
    }
}
