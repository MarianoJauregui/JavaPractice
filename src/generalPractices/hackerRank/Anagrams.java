package generalPractices.hackerRank;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        char[] aChar = a.toLowerCase().toCharArray();
        char[] bChar = b.toLowerCase().toCharArray();
        //If the length of the strings is not the same, they cannot be anagrams
        if (aChar.length != bChar.length) {
            return false;
        } else {
            Arrays.sort(aChar);
            Arrays.sort(bChar);
            return Arrays.equals(aChar, bChar);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean answer = isAnagram(a,b);
        System.out.println((answer) ? "Anagrams" : "Not Anagrams");
    }
}
