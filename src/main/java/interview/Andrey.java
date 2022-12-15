package interview;

import java.util.Stack;

/*
input: array 1, 2, 3, 4, 5.. 99, 100
3 - aaa
5 - bbb
3 and 5 - ccc
output: 1, 2, aaa, 4, bbb, aaa..
 */
public class Andrey {
    public static void main(String[] args){
        String input = "[(]{)}()";
        System.out.println(isBalanced(input));

        printArray();

        }

        static boolean isBalanced(String input){
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i<input.length(); i++){
                char x = input.charAt(i);
                if(x == '(' || x == '[' || x == '{'){
                    stack.push(x);
                    continue;
                }
                char check;
                switch (x){
                    case ')' -> {
                        check = stack.pop();
                        if(check == '{' || check == '[')
                            return false;
                    }case '}' -> {
                        check = stack.pop();
                        if(check == '(' || check == '[')
                            return false;
                    } case ']' -> {
                        check = stack.pop();
                        if(check == '{' || check == '(')
                            return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        static void printArray(){
            int[] arr = new int[100];

            for(int i = 1; i<100; i++){
                arr[i] = i;
            }

            for (int j : arr) {
                if ((j % 3 == 0) && (j % 5 == 0)) {
                    System.out.println("ccc");
                } else if (j % 5 == 0) {
                    System.out.println("bbb");
                } else if (j % 3 == 0) {
                    System.out.println("aaa");
                } else {
                    System.out.println(j);
                }
            }
        }

}
