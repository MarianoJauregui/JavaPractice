package generalPractices.leetCode;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutive(arr));
    }
    //Given an array nums, return the maximum consecutive elements in the array (in this case, we will search for 1's)
    public static int findMaxConsecutive(int[] nums){
        int count = 0;
        int result = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                result = Math.max(count, result);
            } else count = 0;
        }
        return result;
    }
}
