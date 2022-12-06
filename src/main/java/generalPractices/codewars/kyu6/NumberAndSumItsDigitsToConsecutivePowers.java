package generalPractices.codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

/*
The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata.
What's the use of saying "Eureka"? Because this sum gives the same number.

In effect: 89 = 8^1 + 9^2

The next number in having this property is 135.

See this property again: 135 = 1^1 + 3^2 + 5^3

We need a function to collect these numbers, that may receive two integers a, b
that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.

Let's see some cases (input -> output):

1, 10 -> [1, 2, 3, 4, 5, 6, 7, 8, 9]

1, 100 -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
 */
public class NumberAndSumItsDigitsToConsecutivePowers {
    public static void main(String[] args){
        System.out.println(sumDigPow(1,100));

    }
    public static List<Long> sumDigPow(long a, long b){
        //I had to lookup for the solution.
        List<Long> list = new ArrayList<>();
        for(long i = a; i <= b; i++){
            String num = Long.toString(i);
            String[] digits = num.split("");
            double sum = 0;

            for(int j = 1; j <= digits.length; j++){
                sum += Math.pow(Integer.parseInt(digits[j-1]), j);
            }

            if(sum == i)
                list.add(i);
        }
        return list;
    }
}
