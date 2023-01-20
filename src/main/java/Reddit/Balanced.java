package Reddit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Balanced {
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Coffee", 100);
        menu.put("Cake", 200);
        menu.put("Popcorn", 225);

        createCombinations(menu, 1000);

    }

    public static void createCombinations(Map<String, Integer> menuProducts, int money){
        List<String> products = new ArrayList<>();

        for(String product : menuProducts.keySet()){
            products.add(product);
        }

        for(String name : products) {
            int wastedMoney = 0;
            int actualProductPrice = menuProducts.get(name);
            menuProducts.remove(name);

            for(Map.Entry<String, Integer> productPrice : menuProducts.entrySet()) {
                wastedMoney += productPrice.getValue();
            }

            if(wastedMoney <= money) {
                System.out.println("This combination is: " + wastedMoney);
                for(Map.Entry<String, Integer> data : menuProducts.entrySet()) {
                    System.out.println(" - " + data.getKey());
                }
            }

            menuProducts.put(name, actualProductPrice);
            System.out.println(" ");
        }


    }



}
