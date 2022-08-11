package generalPractices.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {
    /*Given a string, s, matching the regular expression [A-Za-z !,?._'@]+,
    split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
    Then, print the number of tokens, followed by each token on a new line. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String splits[] = s.split("[!,?._'@ ]");
        splits = Arrays.stream(splits).filter(str -> !str.isEmpty()).toList().toArray(new String[0]);
        System.out.println(splits.length);
        for (String z: splits) {
            System.out.println(z);
        }
    }
}
