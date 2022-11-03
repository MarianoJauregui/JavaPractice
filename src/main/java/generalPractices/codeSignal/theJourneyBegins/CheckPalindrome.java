package generalPractices.codeSignal.theJourneyBegins;

public class CheckPalindrome {

    static boolean solution(String str){
        int i = 0;
        int j = str.length() -1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){ //if we want we can put str.toLowerCase to prevent mistakes.
                i++; j--;
            } else return false;
        }
        return true;
    }
}
