package generalPractices.codeSignal.theJourneyBegins;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(solution("MeNEm"));
        System.out.println(solution2("MeNEm"));
    }

    static boolean solution(String str){
        int i = 0;
        int j = str.length() -1;
        str=str.toLowerCase();

        while(i < j){
            if(str.charAt(i) == str.charAt(j)){ //if we want we can put str.toLowerCase to prevent mistakes.
                i++; j--;
            } else return false;
        }
        return true;
    }

    static boolean solution2(String str){
        return str.equals(new StringBuilder(str).reverse().toString()); //This doesn't allow to check uppercase or lowercase whatsoever.
    }
}
