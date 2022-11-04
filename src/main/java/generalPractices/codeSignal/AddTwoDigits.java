package generalPractices.codeSignal;

public class AddTwoDigits {
    /*
    You are given a two-digit integer n. Return the sum of its digits.
    Example
    For n = 29, the output should be
    solution(n) = 11.
     */
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    static int solution(int n) {
        return n / 10 + n % 10;
    }
}
