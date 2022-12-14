package generalPractices.codewars.kyu8;

import java.util.Arrays;


public class Isogram {
    /* An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case. */

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogramEasierSolution("kasjdfhu"));
    }

    public static boolean  isIsogram(String str) {
        char[] ch = str.toLowerCase().toCharArray();
        Arrays.sort(ch);
        for(int i=0; i<str.length() -1; i++){
            if (ch[i] == ch[i+1])
                return false;
        }
        return true;
    }

    public static boolean isIsogramEasierSolution(String str){
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
