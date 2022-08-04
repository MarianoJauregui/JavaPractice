package generalPractices;

import java.util.Arrays;
import java.util.Scanner;

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

        /*
        Given a set of numbers, return the additive inverse of each.
        Each positive becomes negatives, and the negatives become positives.
         */
        int[] arrayOne = {-1,-2,-3,-4,-5};
        int[] arrayTwo = {-1,-2-3,4,5};

        System.out.println(Arrays.toString(Arrays.stream(arrayOne).map(i -> -i).toArray()));

        //A simpler solution
        for(int i=0; i< arrayOne.length; i++){
            arrayOne[i] *= -1;
        }
        // return arrayOne;
        /*
        Return the result of multiplying the values together in order
         */
        int product = 1;
        for (int j : arrayTwo) {
            product = product * j;
        }

        /*
        Grade book: Complete the function so that it finds the average of the three scores
         passed to it and returns the letter value associated with that grade.
         These values are hardcoded, in codewars they are introduced with the execution of the program.
         */

        int s1 = 12;
        int s2 = 68;
        int s3 = 91;
        int score = (int)Math.ceil((s1+s2+s3)/3);

        System.out.println(score>=90 ? 'A'
                : score>=80 ? 'B'
                : score>=70 ? 'C'
                : score>=60 ? 'D' : 'F');

        /*
        All the animals are having a feast! Each animal is bringing one dish.
        There is just one rule: the dish must start and end with the same letters as the animal's name.
        For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
        Write a function feast that takes the animal's name and dish as arguments and returns
         true or false to indicate whether the beast is allowed to bring the dish to the feast.
         */
        String animal = "ALSDFAKSDOFK";

        String firstLetter = animal.substring(0,1);
        String lastLetter = animal.substring(animal.length() -1);







    }
}
