package generalPractices.codewars.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Your task is to sort a given string. Each word in the string will contain a single number.
This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string.
The words in the input String will only contain valid consecutive numbers.

Examples:
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""

 */
public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
    public static String order(String words) {

        String[] wordsAlone = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Integer, String> ordered = new HashMap<>();

        for(int i=0; i < wordsAlone.length; i++){
            for(int j=0; j < wordsAlone[i].length(); j++){
                if(Character.isDigit(j)){
                    ordered.put(j -1, wordsAlone[i]);
                }
            }
        }

        for(Map.Entry<Integer, String> entry : ordered.entrySet()){
            stringBuilder.append(entry.getValue() + " ");
        }
        return stringBuilder.toString().trim();

    }
}
