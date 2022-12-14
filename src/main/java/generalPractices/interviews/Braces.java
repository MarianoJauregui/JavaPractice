package generalPractices.interviews;


import java.util.Stack;

/* Given a list of string of bracket characters: {}(), the string of brackets is balanced under the following conditions:
1) It is the empty string
2) If string a and b are balanced, then ab is balanced
3) If string a is balanced, then (a) and {a} are balanced.
Write a class that determines whether the brackets in each string are balanced and returns true if the string is balanced,
or false if it is not.
 */
public class Braces {
   public static void main(String[] args) {
       System.out.println("Is it balanced? " + isBalanced("([])"));


       System.out.println(isBalancedStack("(((())))"));
    }
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < s.length(); i++){
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

    public static boolean isBalancedStack(String str){
        Stack<String> stack = new Stack<>();
        int i = 0;
        while(i < str.length()){
            if(str.charAt(i) == '('){
                stack.push("(");
            }
            else if(str.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                } else stack.push(")");
                break;
            }
            i++;
        }
        return stack.isEmpty();
    }


}
