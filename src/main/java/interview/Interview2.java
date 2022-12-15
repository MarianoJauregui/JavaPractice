package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Input:
 * <p>
 * String line = "123 456 231 546 231 312 4556";
 * Output:
 * 123, 231, 231, 312 - are numeric anagrams
 * 456, 546 - are numeric anagrams
 * 4556 - has no anagrams
 */


public class Interview2 {

    public static void main(String [] args){
        String line = "123 456 231 546 231 312 4556";

        solution(line);

    }

    public static void solution(String inputString) {
        Set<Set<String>> groupOfAnagrams = new HashSet<>();
        Set<String> noAnagrams = new HashSet<>();

        String[] arrayOfStrings = inputString.split("[\\s]", -1);

        for (String string : arrayOfStrings) {
            Set<String> anagrams = Arrays.stream(arrayOfStrings)
                    .filter(s -> !s.equals(string) && isAnagram(s, string)).collect(Collectors.toSet());
            groupOfAnagrams.add(anagrams);

            if (anagrams.isEmpty()) {
                noAnagrams.add(string);
            }

        }

        groupOfAnagrams.forEach(anagramList -> System.out.println(anagramList.toString() + " - are numeric anagrams"));
        noAnagrams.forEach(noAnagram -> System.out.println(noAnagram + " - has no anagrams"));
    }

    public static HashMap<String, Long> mapOfChars(String string1) {
        HashMap<String, Long> charOccurrences = new HashMap<>();

        for (char character : string1.toCharArray()) {
            long occurrences = 0;
            charOccurrences.put(String.valueOf(character), occurrences);
        }
        return charOccurrences;
    }

    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        return mapOfChars(string1).equals(mapOfChars(string2));
    }

}
