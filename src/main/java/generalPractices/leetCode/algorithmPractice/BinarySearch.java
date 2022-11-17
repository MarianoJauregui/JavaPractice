package generalPractices.leetCode.algorithmPractice;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        //System.out.println(arr.length);
        //System.out.println("Array position: " + arr[5]);
        System.out.println("The position of the target number is: " + search(arr, 12));

        System.out.println("The position of the target number using binary search is: "
                + searchNumber(arr, 9));

        }

    public static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i])
                return i;
        }
        return -1;
    }

    public static int searchNumber(int[] arr, int target) {
        int first = 0;
        int last = arr.length;

         while(first <= last){
             int mid = (first+last) / 2;
             if(arr[mid] == target){
                 return mid;
             }else if(arr[mid] < target){
                 first = mid + 1;
             } else {
                 last = mid - 1;
             }
         }
         return -1;
    }

}