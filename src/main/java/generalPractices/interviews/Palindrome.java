package generalPractices.interviews;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("NeuquEN"));
    }
    public static boolean isPalindrome(String word){
        int i = 0;
        int j = word.length() -1;
        while(i < j){
            if(word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)){
                i++; j--;
            } else return false;
        }
        return true;
    }
}
