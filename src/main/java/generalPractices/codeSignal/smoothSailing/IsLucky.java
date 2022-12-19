package generalPractices.codeSignal.smoothSailing;
/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.


 */
public class IsLucky {
    public static void main(String[] args){
        System.out.println(solution(1230));
    }

    static boolean solution(int number) {
        String string = number + "";
        int sum = 0;

        for(int i=0; i < string.length()/2; i++){
            sum += (string.charAt(i) - string.charAt(string.length() -1 -i));
        }

        return sum == 0;
    }
}
