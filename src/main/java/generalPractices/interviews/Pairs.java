package generalPractices.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * A function called pairs() takes an array, for example [3,1,8].
 * It should return all pairs, e.g. for mentioned example: [[3,1],[3,8],[1,8]].
 **/
public class Pairs {
    public static void main(String[] args) {
        int[] arr = {3,1,8};
        System.out.println(pairs(arr));
    }

    public static List<Integer> pairs(int[] arr){
        List<Integer> integers = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[i] == arr[j]) continue;
                integers.add(arr[i]);
                integers.add(arr[j]);
            }
        }
        return integers;
    }

}
