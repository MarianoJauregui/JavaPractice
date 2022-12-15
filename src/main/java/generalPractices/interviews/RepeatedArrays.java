package generalPractices.interviews;


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
        String str = "4[a2[b]]";

        System.out.println(solution(str));
    }


    static String solution(String word) {
        StringBuilder answer = new StringBuilder(word);

        while(answer.toString().contains("[")) {

            int openBracket = answer.lastIndexOf("[");
            int closeBracket = answer.indexOf("]", openBracket);

            String bracket = answer.substring(openBracket + 1, closeBracket);

            int repetitions = Integer.parseInt(String.valueOf(answer.charAt(openBracket - 1)));

            String replacedPart = bracket.repeat(repetitions);

            answer.delete(openBracket - 1, closeBracket + 1);
            answer.insert(openBracket - 1, replacedPart);
        }
        return answer.toString();
    }



























    public static String repeatedArrayLeaSolution(String inputString){
        int startIndex, endIndex, multiplier;

        while (inputString.contains("[")){

            startIndex = inputString.lastIndexOf("[");
            endIndex = inputString.indexOf("]", startIndex);
            multiplier = Character.getNumericValue(inputString.charAt(startIndex - 1));

            String multipliedString = inputString.substring(startIndex + 1, endIndex);
            //System.out.println(multipliedString);
            inputString = inputString.replace
                    (inputString.substring(startIndex - 1, endIndex + 1),
                            multipliedString.repeat(multiplier));

            //System.out.println(inputString);
        }
        return inputString;
    }

}

