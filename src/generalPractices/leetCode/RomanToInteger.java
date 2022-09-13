package generalPractices.leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    //Given a roman numeral, convert it to an integer

    public static int romanToInt(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        str = str.replace("IV","IIII");
        str = str.replace("IX","VIIII");
        str = str.replace("XL","XXXX");
        str = str.replace("XC","LXXXX");
        str = str.replace("CD","CCCC");
        str = str.replace("CM","DCCCC");

        int number = 0;

        for(int i=0; i < str.length(); i++){
            number = number + (map.get(str.charAt(i)));
        }

        return number;
    }
}
