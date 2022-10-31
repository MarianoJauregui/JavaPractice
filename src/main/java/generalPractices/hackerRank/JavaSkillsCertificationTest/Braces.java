package generalPractices.hackerRank.JavaSkillsCertificationTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Braces {
    /* Given a list of string of bracket characters: {}(), the string of brackets is balanced under the following conditions:
   1) It is the empty string
   2) If string a and b are balanced, then ab is balanced
   3) If string a is balanced, then (a) and {a} are balanced.
   Write a class that determines whether the brackets in each string are balanced and returns true if the string is balanced,
   or false if it is not.
     */
    static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i <s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }

            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();

        if(isBalanced(expression)) System.out.println("Balanced");
        else System.out.println("Not balanced");
    }
}
