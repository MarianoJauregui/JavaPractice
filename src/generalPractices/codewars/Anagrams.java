package generalPractices.codewars;

    /* Complete the function to return true if the two arguments given are anagrams of each other;
    return false otherwise.
    Examples:
    "foefet" is an anagram of "toffee"
    "Buckethead" is an anagram of "DeathCubeK" */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "olleH"));
    }

    //Easiest solution (for me)
    public static boolean isAnagram(String test, String original) {
        if(test == null || original == null || test.length() != original.length())
            return false;
        char[] ch1 = test.toLowerCase().toCharArray();
        char[] ch2 = original.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static boolean isAnagramWithHashMap(String test, String original){
        Map<Character, Integer> charFrequencyTest = stringToHashMap(test);
        Map<Character, Integer> charFrequencyOriginal = stringToHashMap(original);

        return charFrequencyTest.equals(charFrequencyOriginal);
    }

    private static Map<Character, Integer> stringToHashMap(String string){
        Map<Character, Integer> charFrequency = new HashMap<>();

        char[] charArray = string.toLowerCase().toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(charFrequency.get(charArray[i]) == null){
                charFrequency.put(charArray[i], 1);
            } else
                charFrequency.put(charArray[i], charFrequency.get(charArray[i]) + 1);
        }
        return charFrequency;

        /*
        This can be replaced with
         Map<Character, Integer> charFrequency = new HashMap<>();

        char[] charArray = string.toLowerCase().toCharArray();
        for (char c : charArray) {
            charFrequency.merge(c, 1, Integer::sum);
        }
        return charFrequency;
         */
    }

}
