package generalPractices.interviews;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnagram {
    public static void main(String[] args){
        isAnagram("BC a a A  1   2", "bcaaa12");
        System.out.println(isAnagramPractice("12 ? % OJK", "OJK 12 ? %"));
    }

    public static void isAnagram(String wordOne, String wordTwo){
        wordOne = wordOne.toLowerCase().replaceAll(" ", "");
        wordTwo = wordTwo.toLowerCase().replaceAll(" ", "");

        if(wordOne.length() == wordTwo.length()){
            char[] arrayOne = wordOne.toCharArray();
            char[] arrayTwo = wordTwo.toCharArray();
            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);

            if(Arrays.equals(arrayOne, arrayTwo)){
                System.out.println("These words are anagrams.");
            }
        } else System.out.println("These words are not anagrams.");
    }

    public static boolean isAnagramPractice(String word1, String word2){
        word1 = word1.toLowerCase().replaceAll("[^a-z1-9]", "");
        word2 = word2.toLowerCase().replaceAll("[^a-z1-9]", "");

        HashMap <Character, Integer> hashmap1 = new HashMap <> ();
        HashMap <Character, Integer> hashmap2 = new HashMap <> ();
        //convert string to character array
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        //for loop for first string
        for (char ch : arr1) {
            //if character not present add to hashmap
            if (!hashmap1.containsKey(ch)) {
                hashmap1.put(ch, 1);
            } else {
                hashmap1.put(ch, hashmap1.get(ch) +1);
            }
        }

        //for loop for second string
        for (char ch : arr2) {
            if (!hashmap2.containsKey(ch))
                hashmap2.put(ch, 1);
            else {
                hashmap2.put(ch, hashmap2.get(ch) +1);
            }
        }

        //check if hashmaps are equal
        return hashmap1.equals(hashmap2);
    }
}
