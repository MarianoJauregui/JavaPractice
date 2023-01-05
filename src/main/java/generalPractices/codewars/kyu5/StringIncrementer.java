package generalPractices.codewars.kyu5;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

/*
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered.


 */
public class StringIncrementer {
    public static void main(String[] args) {
        String str1 = "foo123";
        String str2 = "foobar0042";
        System.out.println(incrementString(str2));
    }

    public static String incrementString(String str) {
//this is clearly not my solution.
        List<String> check = Arrays.asList("0","1","2","3","4","5","6","7","8","9");

        if(str.length()== 0)
            return str +"1";


        return str.substring(str.length()-1).equals("9") ? incrementString(str.substring(0,str.length()-1)) +"0": str.substring(0,str.length()-1) + String.valueOf( Integer.parseInt( str.substring(str.length()-1) ) +1  );
    }
}
