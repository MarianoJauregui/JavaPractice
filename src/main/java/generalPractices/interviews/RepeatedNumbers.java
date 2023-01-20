package generalPractices.interviews;

import java.util.HashSet;

public class RepeatedNumbers {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,7,8,9};
        System.out.println(repeatedNumbers(arr));
    }

    public static boolean repeatedNumbers(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : arr){
            if(hashSet.contains(num)) {
                return true;
            }
            else hashSet.add(num);
        }
        return false;
    }
}
