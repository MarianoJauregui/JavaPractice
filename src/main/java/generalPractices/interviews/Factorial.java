package generalPractices.interviews;

public class Factorial {
    public static void main(String[] args) {
        factorial(4);
    }

    public static void factorial(int num){
        long product = 1;
        int i = 1;

        do{
            product *= i;
            i++;
        } while (i <= num);
        System.out.println(product);
    }
}
