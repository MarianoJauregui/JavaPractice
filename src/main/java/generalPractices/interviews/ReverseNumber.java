package generalPractices.interviews;

public class ReverseNumber {
    public static void main(String[] args){
        System.out.println(reverseNumber(1234));

    }

    public static int reverseNumber(int number){
        int reversed = 0;

        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }

        return reversed;
    }
}
