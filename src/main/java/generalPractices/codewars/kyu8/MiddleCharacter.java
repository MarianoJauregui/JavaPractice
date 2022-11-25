package generalPractices.codewars.kyu8;

/**
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd,
 * return the middle character. If the word's length is even, return the middle 2 characters.
 *
 * #Examples:
 *
 * Kata.getMiddle("test") should return "es"
 *
 * Kata.getMiddle("testing") should return "t"
 *
 * Kata.getMiddle("middle") should return "dd"
 *
 * Kata.getMiddle("A") should return "A"
 */
public class MiddleCharacter {
    public static void main(String[] args) {
        String test = "test";
        System.out.println(getMiddle(test));
    }
    public static String getMiddle(String word) {
        if(word.length() == 1 || word.length() == 2)
            return word;

        if(word.length() % 2 == 0) {
            return "" + word.charAt(word.length() /2 - 1) + word.charAt(word.length() /2);
        }else {
            return "" + word.charAt(word.length() /2);
        }
    }
}
