package generalPractices.interviews;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args){
        isAnagram("BC a a A  1   2", "bcaaa12");
    }

    public static void isAnagram(String wordOne, String wordTwo){
        wordOne = wordOne.toLowerCase().replaceAll("[^a-z1-9]", "");
        wordTwo = wordTwo.toLowerCase().replaceAll("[^a-z1-9]", "");

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
}
