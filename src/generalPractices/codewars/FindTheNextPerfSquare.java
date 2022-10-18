package generalPractices.codewars;
/*  You might know some pretty large perfect squares. But what about the NEXT one?
    Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
    Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
    If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
 */

public class FindTheNextPerfSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));

    }

    public static long findNextSquare(long sq) {
        if(Math.sqrt(sq) % 1 != 0) return -1;

        long nextSquare = (int)Math.floor(Math.sqrt(sq)) + 1;
        return nextSquare*nextSquare;
    }
}
