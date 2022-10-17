package generalPractices.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowGoodAreYou {
    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(betterThanAverage(arr, 5));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints){

        List<Integer> newArray = new ArrayList<>();

        for(int points : classPoints){
            newArray.add(points);
        }
        newArray.add(yourPoints);
        int sum = newArray.stream().mapToInt(Integer::intValue).sum();
        int average = sum / newArray.size();

        return yourPoints > average;


        //One line solution

        // return Arrays.stream(classPoints).average().orElse(0) < yourPoints;

    }
}
