package generalPractices.codewars.kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Return a new array consisting of elements which are multiple of their own index in input array (length > 1).
 */
public class MultipleOfIndex {
    public static void main(String[] args) {
        int[] arr = {22, -6, 32, 82, 9, 25};
        System.out.println(Arrays.toString(multipleOfIndex(arr)));

    }
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> multiples = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0)
                multiples.add(array[i]);
        }

        int[] finalArray = new int[multiples.size()];
        for(int i=0; i<multiples.size(); i++){
            finalArray[i] = multiples.get(i);
        }
        return finalArray;
    }
}
