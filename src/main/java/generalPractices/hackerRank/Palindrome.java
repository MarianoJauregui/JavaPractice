package generalPractices.hackerRank;

import java.util.Scanner;

//Basicamente es una palabra capicua
public class Palindrome {
    static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length() -1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isPalindrome(str.toLowerCase()));
    }
}
