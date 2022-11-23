package generalPractices.interviews;

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        getNonRepetitiveLetters("HHHOOOLLLAAA!!!");

    }

    //Remove repeated letters.
    public static void getNonRepetitiveLetters(String word){ //I don't understand this solution.
        String out = word.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining(""));
        System.out.println(out);
    }
}
