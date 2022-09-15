package generalPractices.leetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1991));
    }
    /*
    Given an integer x, return true if x is palindrome integer.
    An integer is palindrome when it reads the same backwards as forwards.
    For example 121.
     */
    public static boolean isPalindrome(int x){
        String reversedX = String.valueOf(x);
        int i=0;
        int j= reversedX.length()-1;

        while(i<j){
            if(reversedX.charAt(i) != reversedX.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
