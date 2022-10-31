package generalPractices.interviews;

public class Fibonacci {
    public static void main(String[] args){
        fibonacci(10);
        System.out.println("");
        System.out.println("");
        fibonacciWhileLoop(10);
    }

    public static void fibonacci(int num){
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Starting fibonacci sequence with a for loop: ");

        for(int i = 1; i <= num; i++) {
            System.out.print(firstNumber + " - ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void fibonacciWhileLoop(int num){
        int firstNumber = 0;
        int secondNumber = 1;
        int i = 1;
        System.out.println("Starting fibonacci sequence with a while loop: ");

        while(i <= num){
            System.out.print(firstNumber + " - ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

            i++;
        }
    }
}
