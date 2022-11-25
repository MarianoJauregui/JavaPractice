package generalPractices.codewars.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestInteger {
    public static void main(String[] args) {
        int[] argsPractice = {-12,2,3,4,5,6,7,8,9,100};
        System.out.println(findSmallestInt(argsPractice));
    }
    //Given an array of integers you should find the smallest one.
    public static int findSmallestInt(int[] args){
        //return Arrays.stream(args).sorted().findFirst().getAsInt();
        // return IntStream.of(args).min().getAsInt();
         Arrays.sort(args); return args[0];
    }
}
