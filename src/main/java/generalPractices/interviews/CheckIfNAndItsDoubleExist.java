package generalPractices.interviews;

import java.util.HashSet;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * Example:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */
public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist_HashSet(arr));
    }

    public static boolean checkIfExist_HashSet(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : arr){ //10,2,5,3
            if(hashSet.contains(num)){
                return true;
            } else{
                hashSet.add(num*2);
                if(num % 2 == 0)
                    hashSet.add(num/2);
            }
        }
        return false;
    }



    public static boolean checkIfExist(int[] arr){
        //LINEAR SEARCH
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == 2 * arr[j] ||
                        arr[i] == arr[j] * 0.5){
                    return true;
                }
            }
        }
        return false;
    }


}
