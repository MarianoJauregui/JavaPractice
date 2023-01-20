package generalPractices.interviews;

import java.util.*;

public class NumericAnagramsGPT {
    public static void main(String[] args){
        String line = "231 546 123 456 231 312 4556 7689";
        System.out.println("CHAT GPT SOLUTION --> " + findNumericAnagrams(line));
    }

    //SOLUTIONS WITH CHATGPT
    /*
It uses a Map (HashMap) to store the anagrams. The key of the map is the sorted version of the number, and the value is a List of anagrams.
It iterates through the numbers, adding each number to the list of anagrams for its sorted version.
It then iterates through the map's values, and if the size of the list of anagrams is greater than 1, it means that there are anagrams, and it joins the list of anagrams using the "String.join" method and appends the anagrams and the message indicating they are anagrams. If the size of the list is 1 it means there is no anagram for that number, and it appends the number with a message indicating that.
Finally, the function returns the contents of the StringBuilder as a String.
     */
    public static String findNumericAnagrams(String str) {
        String[] numbers = str.split(" ");

        Map<String, List<String>> anagrams = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            char[] chars = num.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!anagrams.containsKey(sorted)) {
                anagrams.put(sorted, new ArrayList<>());
            }
            anagrams.get(sorted).add(num);
        }

        for (List<String> group : anagrams.values()) {
            if (group.size() > 1) {
                result.append(String.join(", ", group));
                result.append(" - are numeric anagrams\n");
            }else{
                result.append(group.get(0) + " - has no anagrams\n");
            }
        }
        return result.toString();
    }
}
