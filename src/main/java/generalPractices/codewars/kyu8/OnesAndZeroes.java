package generalPractices.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

public class OnesAndZeroes {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(0);
        integerList.add(1);
        integerList.add(1);
        System.out.println(convertBinaryArrayToInt(integerList));
        System.out.println(convertBinaryArrayToIntWithStream(integerList));
    }
    //Given an array on ones and zeroes, convert the equivalent binary value to an integer.
    //Eg: [0,0,0,1] is treated as 0001 witch is the binary representation of 1.

    public static int convertBinaryArrayToInt(List<Integer> binary){
       int total = 0;
       int currentValue = 1;
       for(int i = binary.size() -1; i >= 0; i--){
           if(binary.get(i) == 1){
               total += currentValue;
           }
           currentValue *= 2;
       }

       return total;
    }

    //Another solution in just one line.
    public static int convertBinaryArrayToIntWithStream(List<Integer> binary){
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}


