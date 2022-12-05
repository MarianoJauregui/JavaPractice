package generalPractices.codewars.kyu6;

import java.util.LinkedList;

/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.
 Example:
 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 */
public class Persistence {

    public static void main(String[] args) {

        System.out.println(persistence(39));
    }
    public static int persistence(long number){
        int result = 0;
        while(number > 9) {
            long multi = 1;
            for (char ch : String.valueOf(number).toCharArray()) {
                multi *= Long.parseLong(String.valueOf(ch));
            }
            number = multi;
            result++;
        }
        return result;
    }

}
