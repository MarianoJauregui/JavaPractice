package generalPractices.interviews;


import java.util.Arrays;
import java.util.Stack;

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
    public static void main(String[] args) {
        String str = "3[a]4[b]";
        System.out.println(returnArray(str));
    }

    public static String returnArray(String input) {
        String res = "";

        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();

        int ch = 0;

        while (ch < input.length()) {
            if (Character.isDigit(input.charAt(ch))) {
                int count = 0;
                while (Character.isDigit(input.charAt(ch))) {
                    count = 10 * count + (input.charAt(ch) - '0');
                    ch++;
                }
                countStack.push(count);
            } else if (input.charAt(ch) == '[') {
                resStack.push(res);
                res = "";
                ch++;
            } else if (input.charAt(ch) == ']') {
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                ch++;
            } else {
                res += input.charAt(ch++);
            }
        }
        return res;
    }
}

