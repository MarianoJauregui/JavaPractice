package generalPractices.codeSignal.smoothSailing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits,
such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.

You have an array of strings crypt, the cryptarithm, and an array containing the mapping of letters and digits, solution.
The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.

If crypt, when it is decoded by replacing all the letters in the cryptarithm with digits using the mapping in solution,
becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, the answer is false.

Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).
 */
public class isCryptSolution {
    public static void main(String[] args){
        String[] crypt = {"SEND", "MORE", "MONEY"};
        char[][] solution = {
                                {'O', '0'},
                                {'M', '1'},
                                {'Y', '2'},
                                {'E', '5'},
                                {'N', '6'},
                                {'D', '7'},
                                {'R', '8'},
                                {'S', '9'}
                            };

        System.out.println(solution(crypt, solution));
    }


    static boolean solution(String[] crypt, char[][] solution) {

        for(char[] arr : solution){
            for(int i=0; i < crypt.length; i++){
                crypt[i] = crypt[i].replace(arr[0], arr[1]);
                }
            //System.out.println(Arrays.toString(crypt));
            }
        for (String str : crypt) {
            if (!str.equals("0") && str.startsWith("0"))
                return false;
        }

        return Long.parseLong(crypt[0])
                + Long.parseLong(crypt[1]) == Long.parseLong(crypt[2]);
    }
}
