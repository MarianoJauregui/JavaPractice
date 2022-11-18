package generalPractices.codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */
public class Mumbling {
    public static void main(String[] args){
        String str = "abcd";
        System.out.println(accum(str));
    }

    public static String accum(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        for(char c : s.toCharArray()){
            if(i > 0) stringBuilder.append('-');
            stringBuilder.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) {
                stringBuilder.append(Character.toLowerCase(c));
            }
                i++;
        }
        return stringBuilder.toString();
    }
}
