package generalPractices.codewars;

import java.util.Arrays;

public class TheHighestProfit {

    public static void main(String[] args) {
        int[] arrayOfInts = {1, 5,78,2,772};
        System.out.println(Arrays.toString(solution(arrayOfInts)));
        System.out.println(setAlarm(true, false));
    }
    // Task -> Write a function that returns both the minimum and maximum number of the given list/array.
    public static int[] solution(int[] array){
        Arrays.sort(array);
        return new int[] {array[0], array[array.length-1]};
    }

    /*
    Write a function named setAlarm which receives two parameters.
    The first parameter, employed, is true whenever you are employed and the second parameter,
    vacation is true whenever you are on vacation.
    The function should return true if you are employed and not on vacation. It should return false otherwise.
     */
    public static boolean setAlarm(boolean employed, boolean vacation){
        return employed && !vacation;
    }

}
