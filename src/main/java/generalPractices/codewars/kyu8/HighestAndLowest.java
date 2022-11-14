package generalPractices.codewars.kyu8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * You are given a string of space separated numbers, and
 * you have to return the highest and lowest number.
 */
public class HighestAndLowest {
    public static void main(String[] args){
        String str = "1 -2 13 40 5";
        System.out.println(highAndLow(str));
        System.out.println(highAndLow2(str));
    }
    public static String highAndLow(String numbers) {
        String[] num = numbers.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for(String s : num){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        return list.get(list.size() - 1) + " " + list.get(0);
    }
    public static String highAndLow2(String numbers){
        StringTokenizer stringTokenizer = new StringTokenizer(numbers, " ");
        List<Integer> arr = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            arr.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        Collections.sort(arr);

        return arr.get(arr.size() -1) + " " + arr.get(0);
    }

    public static String highAndLow3(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s : array) {
            int value = Integer.parseInt(s);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
    }
}
