package generalPractices.codewars;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
    //Simple. Check if a given number is a perfect square or not.
    public static boolean isSquare(int n) {
        //double square = Math.sqrt(n);
        //return (square - Math.floor(square)) == 0;

        //Solution in just one line:
        return Math.sqrt(n) % 1 == 0;
    }
}
