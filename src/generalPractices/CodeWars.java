package generalPractices;

import java.util.Arrays;

public class CodeWars {
    public static void main(String[] args) {
        /*
        Consider an array/list of sheep where some sheep may be missing from their place.
        We need a function that counts the number of sheep present in the array (true means present).
         */
        Boolean[] arrayBoolean = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        int count = 0;
        boolean isPresent = true;

        for (boolean element : arrayBoolean) {
            if (element == isPresent) {
                count++;
            }
        }
        System.out.println("The total number of true in this array is -> " + count);

        /*
        Simple, remove the spaces from the string, then return the resultant string.
         */

        String stringToEvaluate = "<8[ j 8   mBliB8g  imjB8B8  jl  ]B>";
        System.out.println(stringToEvaluate.replaceAll("\\s+", ""));



    }
}
