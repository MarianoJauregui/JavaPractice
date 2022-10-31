package main.java.generalPractices.codewars;

import java.util.Arrays;

/*
    Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below.
    Index 0 will be considered even.
    For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
    The input will be a lowercase string with no spaces.
 */
public class AlternateCapitalization {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("abcdef")));
    }
    public static String[] capitalize(String s) {
        String str = s.toUpperCase();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i % 2 == 0 ){
                odd.append(str.charAt(i));
                even.append(str.charAt(i));
            } else{
                even.append(s.charAt(i));
                odd.append(s.charAt(i));
            }
        }
        return new String[]{even.toString(), odd.toString()};
    }
}
