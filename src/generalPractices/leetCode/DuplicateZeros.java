package generalPractices.leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*  Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
        Note that elements beyond the length of the original array are not written. Do the above modifications to the input
        array in place and do not return anything.

        Example 1:
        Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4]
     */

    public static void duplicateZeros(int[] arr){
            //We create a queue
        Queue<Integer> queue = new LinkedList<>();
        //We iterate through the array
        for(int i = 0; i < arr.length; i++){
            //if arr[i] is 0, we add two zeros, just in case we have to use it in the future.
            if(arr[i] == 0 ){
                queue.add(0);
                queue.add(0);
            } else{ //If it is just a regular number, we add that to the queue.
                queue.add(arr[i]);
            }
            Integer first = queue.poll(); //Poll will remove the element at the front of the container and delete it.
            arr[i] = first;
        }
            }
        }

