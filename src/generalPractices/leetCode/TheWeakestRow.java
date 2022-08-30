package generalPractices.leetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

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
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b) -> a[0] != b[0] ?
                b[0] - a[0] : b[1] - a[1]);
        int[] res = new int[k];
        for(int i=0; i< mat.length; i++){
            int soldiers = 0;
            for(int j=0; j < mat[0].length; j++){
                if(mat[i][j] == 1) soldiers++;
                else break;
            }
            priorityQueue.offer(new int[]{soldiers, i});
        }
        while (priorityQueue.size() > k){
            priorityQueue.poll();
        }
        while (k > 0) res[--k] = priorityQueue.poll()[1];
        return res;
    }
}
