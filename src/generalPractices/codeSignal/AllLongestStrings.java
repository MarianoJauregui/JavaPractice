package generalPractices.codeSignal;

import java.util.Arrays;

public class AllLongestStrings {

    public static String[] solution(String[] inputArray){

        int longest = Arrays.stream(inputArray)
                .mapToInt(String::length)
                .max().orElse(-1);

        return Arrays.stream(inputArray)
                .filter(word -> word.length() == longest)
                .toArray(String[]::new);
    }

}
