package generalPractices.interviews;

import java.util.*;

//Coins = 400;
//Menu = { "coffee" : 100
//                 "cake" : 200
//		"popcorn" : 225
//}
//Write a method that will show all possible combinations that can bought for coins

public class CoinsLeoSolution {
    public static void main(String[] args){

        Map<String, Integer> myMenu = new HashMap<>();
        myMenu.put("Coffe", 100);
        myMenu.put("Cake", 200);
        myMenu.put("PopCorn", 225);


        int money = 400;
        createCombinations(myMenu, money);
        
    }

    public static void createCombinations(Map<String, Integer> menuProducts, int money){

        List<String> products = new ArrayList <>();

        for(String product: menuProducts.keySet()){
            products.add(product);
        }

        for(String name : products){
            int wastedMoney=0;
            int actualProductPrice = menuProducts.get(name);
            menuProducts.remove(name);

            for (Map.Entry<String, Integer> prodPrice : menuProducts.entrySet()) {
                wastedMoney += prodPrice.getValue();
            }

            if(wastedMoney<=money){
                System.out.println("this combination costs: " + wastedMoney);
                for(Map.Entry<String, Integer> data : menuProducts.entrySet()){
                    System.out.print(" - " + data.getKey());
                }
            }
            menuProducts.put(name, actualProductPrice);
            System.out.println(" ");
        }
    }
}
