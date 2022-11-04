package generalPractices.codeSignal;

public class LargestNumber {
    /*
    Given an integer n, return the largest number that contains exactly n digits.
    Example
    For n = 2, the output should be
    solution(n) = 99.
     */
    public static void main(String[] args) {
        System.out.println(solution(9)); //siempre va a ser menor a 9 porque pasados los 10 digitos el número sería muy grande para un Integer
    }
    static int solution(int n) {
        return (int) Math.pow(10,n)-1;
    }

}
