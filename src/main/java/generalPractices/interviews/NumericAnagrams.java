package generalPractices.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Output:
//  * 123, 231, 231, 312 - are numeric anagrams
//  * 456, 546 - are numeric anagrams
//  * 4556 - has no anagrams
public class NumericAnagrams {
    public static void main(String[] args){


    String line = "231 546 123 456 231 312 4556 7689";
    String [] split = line.split(" ");

    Map<String,String> mapped = new HashMap<>();

        for (String s : split) {
            char[] solution = s.toCharArray();

            Arrays.sort(solution);
            String sorted = new String(solution);

            if (mapped.containsKey(sorted)) {
                String auxiliary = mapped.get(sorted);
                auxiliary = auxiliary + " " + s;
                mapped.put(sorted, auxiliary);
            } else {
                mapped.put(sorted, s);
            }
        }

        for(Map.Entry entry2 : mapped.entrySet()){
            System.out.println("Keys: " + entry2.getKey() + " - Values: " + entry2.getValue());
        }

    for(Map.Entry<String,String> entry : mapped.entrySet()){

        System.out.print(entry.getValue());

        if(entry.getValue().split(" ").length > 1){
            System.out.println(" - are numeric anagrams");
        }
        else
            System.out.println(" - has no anagrams");
        }

    }

}

