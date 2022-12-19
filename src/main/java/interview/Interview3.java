package interview;
/*
# Q2
## input => "3[a]4[b]"
## output => "aaabbbb"
# Q3
## input => "3[a2[b]]"
## interim output => "3[abb]"
## output => "abbabbabb" (edited)
 */
public class Interview3 {

    public static void main(String[] args){
        String str1 = "3[a]4[b]";
        String str2 = "3[a2[b]]";
        System.out.println(solution(str1));
        System.out.println(solution(str2));

        //This will be only for the first scenario.
        String str3 = "3[ab]";
        System.out.println(firstSolution(str3));
    }


    public static String solution(String str){
        StringBuilder answer = new StringBuilder(str);

        while (answer.toString().contains("[")){

            int openBracket = answer.lastIndexOf("[");
            int closedBracket = answer.indexOf("]", openBracket);

            String bracket = answer.substring(openBracket + 1, closedBracket);

            int repetitions = Integer.parseInt(String.valueOf(answer.charAt(openBracket -1)));

            String replaced = bracket.repeat(repetitions);

            answer.delete(openBracket -1, closedBracket +1);
            answer.insert(openBracket -1, replaced);
        }
        return answer.toString();
    }

    public static String firstSolution(String str){
        StringBuilder answer = new StringBuilder(str);

        int openBracket = answer.lastIndexOf("[");
        int closedBracket = answer.indexOf("]", openBracket);

        int repetitions = Integer.parseInt(String.valueOf(str.charAt(openBracket -1)));

        String lettersToMultiply = answer.substring(openBracket +1, closedBracket);

        String replacement = lettersToMultiply.repeat(repetitions);

        answer.delete(openBracket -1, closedBracket +1);
        answer.insert(openBracket -1, replacement);

        return answer.toString();
    }
}
