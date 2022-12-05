package generalPractices.interviews;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesString {
    public static void main(String[] args){
        String str = "Mariano Jauregui";
        str = str.replaceAll(" ", "");
        System.out.println("The occurrence of every character in the string is: " );
        countCharacters(str);
    }

    public static void countCharacters(String input){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] inputArray = input.toCharArray();

        for(char c : inputArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else{
                map.put(c, 1);
            }
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println("Letter: " + entry.getKey() + " number of times: " + entry.getValue());
        }
    }
}
