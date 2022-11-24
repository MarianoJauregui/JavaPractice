package generalPractices.codeSignal.interviewPractice.arrays;

import java.util.HashSet;

/**
 * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index.
 * In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does.
 * If there are no such elements, return -1.
 * Example
 * For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.
 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.
 * For a = [2, 2], the output should be solution(a) = 2;
 * For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.
 */
public class FirstDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,2};
        System.out.println(solutionWithHashSet(arr));
    }

    static int solution(int[] arr){
        //BRUTE FORCE SOLUTION
        //TIME COMPLEXITY: 0(n2)
        int minSecondIndex = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    minSecondIndex = Math.min(minSecondIndex, j);
                }
            }
        }
        if(minSecondIndex == arr.length) return -1;
        else return arr[minSecondIndex];
    }

    static int solutionWithHashSet(int[] arr){
        HashSet<Integer> ints = new HashSet<>();

        for(int i : arr){
            if(ints.contains(i)){
                return i;
            } else{
                ints.add(i);
            }
        }
        return -1;
    }
}
