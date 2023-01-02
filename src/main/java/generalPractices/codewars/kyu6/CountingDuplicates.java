package generalPractices.codewars.kyu6;

import java.util.HashMap;


/*
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive
alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.


 */
public class CountingDuplicates {
    public static void main(String[] args){
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;

        //System.out.println(duplicateCount(test));

        String str = "aabBcde";
        System.out.println(duplicateCount(str));
    }

    public static int duplicateCount(String text) {
        // Write your code here
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : text.toLowerCase().toCharArray()){
            //map.put(ch, map.containsKey(ch) ? 1 : 0);
            if(map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                map.put(ch, 0);
            }
        }

        return (int) map.values().stream().filter(chars -> chars > 0).count();
    }
}
