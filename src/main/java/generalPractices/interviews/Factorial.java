package generalPractices.interviews;

public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }

    public static void factorial(int num){
        long product = 1;
        int i = 1;
        do{
            product *= i;
            System.out.print(product + " ");
            i++;
        } while (i <= num);
    }
}
