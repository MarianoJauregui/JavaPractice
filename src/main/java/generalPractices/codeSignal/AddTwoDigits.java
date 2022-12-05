package generalPractices.codeSignal;

public class AddTwoDigits {
    /*
    You are given a two-digit integer n. Return the sum of its digits.
    Example
    For n = 29, the output should be
    solution(n) = 11.
     */
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        System.out.println(solution(11));
        System.out.println(arraySolution(arr));
    }

    static int solution(int n) {
        return n / 10 + n % 10;
    }

    static int arraySolution(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num / 10 + num % 10;
        }
        return sum;
    }
}
