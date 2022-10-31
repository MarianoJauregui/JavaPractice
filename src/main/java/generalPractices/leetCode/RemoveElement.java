package generalPractices.leetCode;


public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.print(removeElement(arr, 2));
        //It checks the size of the "new" array and that there are no 2's in it (if we pass the number 2 on the parameter)
        //It is kind of a weird problem because the explanation is not quite clear. Took me a while to figure it out.

    }
    /*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The relative order of the elements may be changed.
    Since it is impossible to change the length of the array in some languages,
    you must instead have the result be placed in the first part of the array nums. More formally,
    if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
    It does not matter what you leave beyond the first k elements.
    Return k after placing the final result in the first k slots of nums.
    Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     */

    public static int removeElement(int[] nums, int val){
        int frontOfTheArray = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[frontOfTheArray] = nums[i];
                frontOfTheArray++;
            }
        }
        return frontOfTheArray;
    }
}
