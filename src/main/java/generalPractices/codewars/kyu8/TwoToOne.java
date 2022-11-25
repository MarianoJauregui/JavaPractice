package generalPractices.codewars.kyu8;

import java.util.Arrays;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }
    // Take 2 string s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible
    // containing distinct letters -each taken only one - coming from s1 or s2
    public static String longest(String s1, String s2){
        StringBuilder s3 = new StringBuilder();
        (s1+s2).chars().distinct().sorted().forEach(c -> s3.append((char) c));
        return s3.toString();
    }
}
