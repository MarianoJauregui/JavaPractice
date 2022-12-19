package interview;
// Count of unique letters in a text

/*
ABCDE This is my family
GHIJ I love them every day
KLMNO Mother, father, baby, oh
PQRST Brother, sister, you can see
UVWXYZ All the people in my family
 */

import java.util.HashMap;
import java.util.Map;

public class Interview {

    public static void main(String[] args){
        uniqueWords("ABCDE This is my family");
        String str = "4[a2[b]]";
        System.out.println(solution(str));

    }

    public static void uniqueWords(String str){
        str = str.replace(" ", "");
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            } else{
                map.put(ch, 1);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            System.out.println("Letter: " + entry.getKey() + ". " + "Amount of times that was found: " + entry.getValue());
        }

    }


    //REPEAT ARRAYS
    static String solution(String word){
        StringBuilder answer = new StringBuilder(word);

        while(answer.toString().contains("[")){
            int openBracket = answer.lastIndexOf("[");
            int closedBracket = answer.indexOf("]", openBracket);

            String bracket = answer.substring(openBracket +1, closedBracket);

            int repetitions = Integer.parseInt(
                    String.valueOf(answer.charAt(openBracket - 1)));

            String replacedPart = bracket.repeat(repetitions);

            answer.delete(openBracket -1, closedBracket +1);
            answer.insert(openBracket -1, replacedPart);
        }

        return answer.toString();
    }
}
