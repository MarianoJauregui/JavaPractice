package generalPractices;


import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Given an array of integers, find the sum of its elements.
         * For example, if the array ar[1,2,3], 1+2+3 = 6, so return 6.
         */
        int[] arrayExample = {1,2,3,4,10,11};
        int sum = 0;
        for (int j : arrayExample) sum += j;
        System.out.println(sum);


        System.out.println("----------------------------------------------");
                /*
            Task
        Given an integer n, perform the following conditional actions:
        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
        */

        int n = sc.nextInt();
        System.out.println((n%2==1 || (n>=6 && n<=20)) ? "Weird"
                : ((n>=2 && n <=5) || n>20) ? "Not Weird" : "Weird");


        System.out.println("----------------------------------------------");
            /*
    In this challenge, you must read an integer, a double, and a String from stdin,
    then print the values according to the instructions in the Output Format section below.
            */
        System.out.println("String: " + sc.next() +
                '\n' + " Double: " + sc.nextDouble() +
                '\n' + sc.nextLine() + " Int: " + sc.nextInt());


        System.out.println("----------------------------------------------");
        /*
        Given an integer N, print its first 10 multiples. Each multiple should be printed in a new line.
         */
        int x = 2;
        for(int i=1; i <= 10; i++){
            int result = x*i;
            System.out.printf("%d x %d = %d\n", x, i, result);
        }


        System.out.println("----------------------------------------------");
        /*
        We use the integers a,b and n to create the following series:
        S0 = 5+1x3=8
        S1 = 5+1x3+2x3=14
        S2 = 5+1x3+2x3+4x3=26
        The input will be:
        2
        0 2 10
        5 3 5
         */
        int t= sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j = 0; j < c; j++){
                a = a + ((int)Math.pow(2,j)*b);
                System.out.print(a + " ");
            }
            System.out.println();
        }


        System.out.println("----------------------------------------------");



    }





}


