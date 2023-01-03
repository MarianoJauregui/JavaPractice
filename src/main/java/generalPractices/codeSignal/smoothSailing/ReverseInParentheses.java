package generalPractices.codeSignal.smoothSailing;
/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
solution(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
solution(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
solution(inputString) = "foorabbazmilb";
 */
public class ReverseInParentheses {
    public static void main(String[] args){
        String str = "foo(bar)baz(blim)";
        System.out.println(solution(str));

    }

    static String solution(String inputString){
       int firstIndex = inputString.lastIndexOf("(");
       int lastIndex = inputString.indexOf(")", firstIndex);

       while (firstIndex != -1){
           StringBuilder reverse = new StringBuilder(inputString.substring(firstIndex +1, lastIndex)).reverse();

           String first = inputString.substring(0, firstIndex);
           String last = inputString.substring(lastIndex + 1);
           inputString = first + reverse + last;

           firstIndex = inputString.lastIndexOf("(");
           lastIndex = inputString.indexOf(")", firstIndex);

        }

       return inputString;
    }
}
