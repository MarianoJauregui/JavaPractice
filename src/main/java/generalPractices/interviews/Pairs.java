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

        for (int i : arr) {
            for (int j : arr) {
                if (i == j) continue;
                integers.add(i);
                integers.add(j);
            }
        }
        return integers;
    }

}
