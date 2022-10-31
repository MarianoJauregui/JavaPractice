package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        //String name = scanner.next();
        //System.out.println("Hello ->" + name);

        //Print the sum of two numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String operation = scanner.next();

        switch (operation) {
            case "sum" -> System.out.println(a + b);
            case "subtract" -> System.out.println(a - b);
            case "divide" -> System.out.println(a / b);
            case "multiply" -> System.out.println(a * b);
        }


        for(int i = 0; i <= 10; i++){
            System.out.println(a * i);
        }

        //area and perimeter of a circle
        float radius = 7.5F;
        float diameter = radius*2;
        System.out.println("The perimeter of the circle is -> " + diameter*Math.PI);
        System.out.println("The area of the circle is -> " + Math.PI*(radius*radius));

        //Takes three numbers and calculates the average
        int average = (a+b+c)/3;
        System.out.println(average);

        */

        //Sum of two binary numbers
        long b1 = scanner.nextLong();
        long b2 = scanner.nextLong();
        int i = 0, carry = 0;
        int[] sum = new int[10];

        while(b1 != 0 || b2 != 0) {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if(carry != 0) {
            sum[i++] = carry;
        } i--;
        System.out.println("Output -> ");
        while( i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.println('\n');

        //Convert decimal to binary
        System.out.println("The decimal number is 10 and the binary value is -> " + Integer.toBinaryString(10));

        //Convert binary to decimal
        String binaryNumber = scanner.nextLine();
        System.out.println("Decimal number -> " + Integer.parseInt(binaryNumber, 2));




        
    }
}
