package generalPractices.codewars.kyu7;

import java.util.Arrays;

/*
Challenge:
Given a two-dimensional array of integers,
return the flattened version of the array with all the integers in the sorted (ascending) order.

Example:
Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]],
your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].


 */
public class FlattenAndSortArray {
    public static void main(String[] args){
        int[][] array = {
                {3,2,1},
                {4,6,5},
                {},
                {9,7,8}
        };
        //System.out.println(Arrays.toString(flattenAndSort(array)));
        System.out.println(Arrays.toString(flattenAndSort(array)));

    }
    public static int[] flattenAndSort(int[][] array){

        int[] flattArr = Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .toArray();

        Arrays.sort(flattArr);

        return flattArr;

    }
}
