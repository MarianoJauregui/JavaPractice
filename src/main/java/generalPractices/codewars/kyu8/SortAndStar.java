package generalPractices.codewars.kyu8;

import java.util.Arrays;

public class SortAndStar {
    public static void main(String[] args) {
        String[] arr = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};

        System.out.println(twoSort(arr));
    }
    /*
    You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
    The returned value must be a string, and have "***" between each of its letters.
    You should not remove or add elements from/to the array.
     */
    public static String twoSort(String[] s){
//        Arrays.sort(s);
//        char[] chars = s[0].toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i=0; i<chars.length-1; i++){
//            stringBuilder.append(String.valueOf(chars[i]));
//            stringBuilder.append("***");
//
//       }
//        return String.valueOf(stringBuilder.append(chars[chars.length-1]));

        //Better solution -->
        Arrays.sort(s);

        return String.join("***", s[0].split(""));
    }

}
