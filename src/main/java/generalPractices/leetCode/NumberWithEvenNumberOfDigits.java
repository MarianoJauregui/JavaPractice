package generalPractices.leetCode;

public class NumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    //Given an array nums of integers, return how many of them contain an even number of digits.
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int even : nums){
            if(String.valueOf(even).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
