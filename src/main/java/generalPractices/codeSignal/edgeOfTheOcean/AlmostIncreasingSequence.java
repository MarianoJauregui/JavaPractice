package generalPractices.codeSignal.edgeOfTheOcean;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 7, 8, 9, 1, -1, 0, 5555};
        System.out.println(solution(arr));

        System.out.println(Integer.MIN_VALUE);
    }
    /*
    Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
    Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
    Sequence containing only one element is also considered to be strictly increasing.

    Example
    For sequence = [1, 3, 2, 1], the output should be
    solution(sequence) = false.
    There is no one element in this array that can be removed in order to get a strictly increasing sequence.
    For sequence = [1, 3, 2], the output should be
    solution(sequence) = true.
    You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
     */

    public static boolean solution(int[] sequence) {
        int count1 = 0;
        int count2 = 0;
        //This loop will only check the numbers that are near each other. If the first index is greater than the second,
        //we will add 1 to count1. When adding 1 to this, that means that the first index was greater than the second one,
        //so we will return false.
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) count1++;
        }

        //The second for loop will check if the first index is greater than the third index.
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] >= sequence[i + 2]) count2++;
        }

        return (count1 <= 1) && (count2 <= 1);
    }

    boolean matiSolution(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i + 1] >= 0) {
                numErr += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
                        && sequence[i] - sequence[i + 2] >= 0
                        && sequence[i - 1] - sequence[i + 1] >= 0) {
                    return false;
                }
            }
        }
        return numErr <= 1;
    }

    boolean solutionGalsas(int[] sequence) {
        int last = Integer.MIN_VALUE;
        int lastPrev = Integer.MIN_VALUE;
        int c = 0;

        for (int num : sequence) {
            if (num <= last) {
                c++;
                if (num > lastPrev) last = num;
            } else {
                lastPrev = last;
                last = num;
            }
        }
        return c <= 1;
    }
}
