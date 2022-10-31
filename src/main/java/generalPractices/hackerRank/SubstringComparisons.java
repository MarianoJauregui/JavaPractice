package generalPractices.hackerRank;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        SortedSet<String> sortedSet = new TreeSet<>();
        for(int i=0; i<=s.length() -k; i++){
            sortedSet.add((s.substring(i,i+k)));
        }
        smallest=sortedSet.first();
        largest=sortedSet.last();

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); //sample input = welcometojava
        int k = scanner.nextInt(); //sample input = 3
        scanner.close();

        System.out.println(getSmallestAndLargest(s, k)); //expected output == ava - wel

    }
}
