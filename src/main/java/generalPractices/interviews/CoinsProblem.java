package generalPractices.interviews;

import java.util.*;

//Coins = 400;
//Menu = { "coffee" : 100
//                 "cake" : 200
//		"popcorn" : 225
//}
//Write a method that will show all possible combinations that can bought for coins
public class CoinsProblem {
    public static void main(String[] args) {
        menu.put("coffee", 100);
        menu.put("cake", 200);
        menu.put("popcorn", 225);

        printAllCombinations();
    }
    public static HashMap<String, Integer> menu = new HashMap<>();
    public static final int MINIMUM_VALUE = 100;


    public static void printAllCombinations(){
        HashSet<List<String>> solutionSet = new HashSet<>();
        int coins = 400;

        for(Map.Entry<String, Integer> entry : menu.entrySet()){
            List<String> firstStep = new ArrayList<>();
            firstStep.add(entry.getKey());
            availableCombination(coins - entry.getValue(), firstStep, solutionSet);
        }

        System.out.println(solutionSet);
    }

    public static void availableCombination(int coins, List<String> currentBranch, HashSet<List<String>> solutionSet){
        if(coins < MINIMUM_VALUE){
            solutionSet.add(currentBranch);
        } else {
            for (Map.Entry<String, Integer> entry : menu.entrySet()) {
                if (coins >= entry.getValue()) {
                    List<String> auxList = new LinkedList<>(currentBranch);
                    auxList.add(entry.getKey());
                    availableCombination(coins - entry.getValue(), auxList, solutionSet);
                }
            }
        }
    }
}
