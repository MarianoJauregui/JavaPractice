package generalPractices.codeSignal.smoothSailing;

import java.util.*;

/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].


 */
public class AllLongestStrings {
    public static void main(String[] args){
        String[] str = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(solution2(str)));


    }


    static String[] solution(String[] inputArray) {
            int longest = Arrays.stream(inputArray)
                    .mapToInt(String::length)
                    .max().orElse(-1);

            return Arrays.stream(inputArray)
                    .filter(word -> word.length() == longest)
                    .toArray(String[]::new);
    }

    static String[] solution2(String[] inputArray){
        int longest = 0;

        for(String str : inputArray){
            if(str.length() > longest)
                longest = str.length();
        }

        List<String> list = new ArrayList<>();

        for(String str : inputArray){
            if(str.length() == longest)
                list.add(str);
        }

        return list.toArray(new String[list.size()]);
    }
}
