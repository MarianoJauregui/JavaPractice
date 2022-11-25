package generalPractices.codewars.kyu7;

import java.util.HashMap;

public class MostFrequentItem {
    public static void main(String[] args) {
        int[] arr = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        System.out.println(mostFrequentItemCount(arr));
    }

    public static int mostFrequentItemCount(int[] collection) {

        if(collection.length == 0) return 0;
        int max = 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : collection){
            if(map.containsKey(num)){
                map.put(num, map.get(num) +1);
            } else {
                map.put(num, 1);
            }
        }

        for (int j : collection) {
            int temp = map.get(j);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
