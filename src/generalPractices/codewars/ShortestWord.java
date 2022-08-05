package generalPractices.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
    /*Simple, given a string of words, return the length of the shortest word(s).
      String will never be empty and you do not need to account for different data types. */
    public static int findShort(String s){
            List<String> words = Arrays.asList(s.split(" "));
            String shortestWord = words.stream().min(Comparator.comparing(word -> word.length())).get();
            char[] smallestWord = shortestWord.toCharArray();
        return smallestWord.length;
    }

}
