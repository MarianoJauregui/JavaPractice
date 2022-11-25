package generalPractices.codewars.kyu8;

import java.util.Arrays;
import java.util.Collections;

/*  Your task is to make a function that can take any non-negative integer as an argument
    and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
    Examples:
    Input: 42145 Output: 54421
    Input: 145263 Output: 654321
    Input: 123456789 Output: 987654321 */
public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc2(145263));
    }
    public static int sortDesc(final int num) {
        char[] separatedDigits = Integer.toString(num).toCharArray();
        Arrays.sort(separatedDigits);
        char[] descendingOrder = new char[separatedDigits.length];
        for(int i = separatedDigits.length -1, j = 0; i >= 0; i--, j++){
            descendingOrder[j] = separatedDigits[i];
        }
        return Integer.parseInt(new String(descendingOrder));
    }

    public static int sortDesc2(final int num){
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }
}
