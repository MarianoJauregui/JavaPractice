package generalPractices.hackerRank;

import java.util.Scanner;

public class StringLexicographically {
    /* Determine if A is lexicographically larger than B and capitalize the first letter in A and B and print them
    on a single line, separated by a space
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println((a.compareTo(b) == 0) ? "Yes" : "No");
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1) + " - " + b.substring(0,1).toUpperCase() + b.substring(1));
    }


}
