package generalPractices.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * Given this input: “3[asdf]” you have to generate an output string: asdfasdfasdf
 * # Q1
 * ## input => “3[asdf]”
 * ## output => “asdfasdfasdf”
 * # Q2
 * ## input => “3[a]4[b]”
 * ## output => “aaabbbb”
 * # Q3
 * ## input => “3[a2[b]]”
 * ## interim output => “3[abb]”
 * ## output => “abbabbabb” (edited)
 */
public class RepeatedArrays {
    public static void main(String[] args){
        String str = "3[asdf]";
        System.out.println(returnArray(str));
    }

    public static int returnArray(String arr){
        int number = 0;
        char[] chars = arr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //if(Character.is(chars[i])){
                number = Integer.valueOf(chars[i]);
            }
        return 0;
        }

    }

