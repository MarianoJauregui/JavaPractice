package generalPractices.codeSignal.smoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Some people are standing in a row in a park.
There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */
public class SortByHeight {
    public static void main(String[] args){
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
       int temp;

       for(int i = 0; i < arr.length; i++){
           for(int j = i+1; j < arr.length; j++){
               if(arr[i] > arr[j] && arr[i] != -1 && arr[j] != -1){

                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
       return arr;
    }

    static int[] solutionTwo(int[] arr){ //This is not my solution.
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr){
            if( num != -1){
                list.add(num);
            }
        }

        Collections.sort(list);

        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != -1){
                arr[i] = list.get(index++);
            }
        }

        return arr;
    }
}
