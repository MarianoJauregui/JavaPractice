package generalPractices.interviews;

    /* Complete the function to return true if the two arguments given are anagrams of each other;
    return false otherwise.
    Examples:
    "foefet" is an anagram of "toffee"
    "Buckethead" is an anagram of "DeathCubeK" */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagramWithHashMap("Hello", "olleH"));

            System.out.println(MJAnagram("Hello", "olleH"));
    }

    static boolean MJAnagram(String test, String original){ //TIME COMPLEXITY: O(n)
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char[] chars1 = test.toLowerCase().toCharArray();
        char[] chars2 = test.toLowerCase().toCharArray();

        for(char ch : chars1) {
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch) +1);
            } else {
                map1.put(ch, 1);
            }
        }

        for(char ch : chars2) {
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch) +1);
            } else {
                map2.put(ch, 1);
            }
        }

        return map1.equals(map2);
    }

    //Easiest solution (for me)
    public static boolean isAnagram(String test, String original) {
        //TIME COMPLEXITY O(n log n)
        //El método Arrays.sort es de O(log n)
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

    public static Map<Character, Integer> stringToHashMap(String string) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        char[] charArray = string.toLowerCase().toCharArray();
        for (char ch : charArray) {
            if (charFrequency.get(ch) == null) {
                charFrequency.put(ch, 1);
            } else
                charFrequency.put(ch, charFrequency.get(ch) + 1);
        }
        return charFrequency;
    }


}
