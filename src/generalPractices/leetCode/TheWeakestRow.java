package generalPractices.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheWeakestRow {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        System.out.println(Arrays.toString(kWeakestRows(matrix, 3)));
    }
    /*
    You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians.
    That is, all the 1's will appear to the left of all the 0's in each row.

    A row i is weaker than a row j if one of the following is true:
    The number of soldiers in row i is less than the number of soldiers in row j.
    Both rows have the same number of soldiers and i < j.
    Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
     */

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] soldierNumber = new int[k];
        int sum = 0;
        ArrayList arrayOne = new ArrayList<>();
        for(int[] arr : mat){
            for(int i : arr){
                sum+= i;
            }
            arrayOne.add(sum);
            sum = 0;
        }
        ArrayList arrayTwo = new ArrayList<>(arrayOne);
        Collections.sort(arrayTwo);

        for(int i=0; i<k; i++){
            soldierNumber[i] = arrayOne.indexOf(arrayTwo.get(i));
            arrayOne.remove(soldierNumber[i]);
            arrayOne.add(soldierNumber[i] - 1);
        }
        return soldierNumber;
    }
}
