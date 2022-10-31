package generalPractices.codeSignal;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    /*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
     each statue having a non-negative integer size. Since he likes to make things perfect,
     he wants to arrange them from smallest to largest so that each statue will be bigger
     than the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
     Help him figure out the minimum number of additional statues needed. */
    /**
     * Example
     *
     * For statues = [6, 2, 3, 8], the output should be
     * solution(statues) = 3.
     */

    public static void main(String[] args) {
        int[] statues2 = {6,2,3,8}; //example input
        int missingStatues = Arrays.stream(statues2).max().getAsInt() -
                Arrays.stream(statues2).min().getAsInt()
                + 1 - statues2.length;
        //8-2+1-4

        System.out.println(missingStatues);
    }


}
