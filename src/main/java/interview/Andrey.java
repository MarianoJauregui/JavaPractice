package interview;


import java.util.Arrays;
import java.util.stream.IntStream;

/*
input: array 1, 2, 3, 4, 5.. 99, 100
3 - aaa
5 - bbb
3 and 5 - ccc
output: 1, 2, aaa, 4, bbb, aaa..
 */
public class Andrey {
    public static void main(String[] args){
        int[] ints = IntStream.range(1,101).toArray();

        int[] ints2 = new int[100];
        Arrays.setAll(ints2, i -> i+1);

        printArray(ints);

        }


        static void printArray(int[] arr){

            for (int j : arr) {
                if ((j % 3 == 0) && (j % 5 == 0)) {
                    System.out.println( j + "-> ccc");
                } else if (j % 5 == 0) {
                    System.out.println(j + "-> bbb");
                } else if (j % 3 == 0) {
                    System.out.println(j + "-> aaa");
                } else {
                    System.out.println(j);
                }
            }
        }

}
