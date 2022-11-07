package generalPractices.interviews;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        List<Integer> list = new ArrayList<>();
        list.add(1); //index 0
        list.add(1); //index 1
        list.add(1); //index 2
        list.add(1); //index 3
        list.add(4, 5);
        System.out.println(list.get(4));

        for (int i = 1; i <= 15; i++) {
            System.out.print(fizzBuzzString(i) + " - ");
        }
    }


    public static String fizzBuzzString(int n){
            /*
    Return an array containing the numbers from 1 to N, where N is the parameter value.
    Replace certain values however if any of the following conditions are met:
    If the value is a multiple of 3: use the value "Fizz" instead
    If the value is a multiple of 5: use the value "Buzz" instead
    If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead
    N will never be less than 1.*/

                if(n % 3 == 0 && n % 5 == 0) //se puede simplificar con n % 15 == 0
                    return ("FizzBuzz");
                else if(n % 5 == 0)
                    return ("Buzz");
                else if(n % 3 == 0)
                    return ("Fizz");
                else return (String.valueOf(n));
            }



    public static List<String> fizzBuzz(int n){
            /*
    Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
    */
        List<String> stringList = new ArrayList<>();

        for(int i=1; i<=n; i++){ //esto arranca en i = 1 porque los list arrancan el size en 1, no en 0
            if(i % 3 == 0 && i % 5 == 0)
                stringList.add("FizzBuzz");
            else if (i % 3 == 0)
                stringList.add("Fizz");
            else if(i % 5 == 0)
                stringList.add("Buzz");
            else stringList.add(String.valueOf(i));
        }
        return stringList;
    }
}
