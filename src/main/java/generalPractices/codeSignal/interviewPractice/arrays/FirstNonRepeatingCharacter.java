package generalPractices.codeSignal.interviewPractice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it.
 * If there is no such character, return '_'.
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abacabad";
        System.out.println(solution(str));
        System.out.println(solutionWithHashMap(str));
    }

    static char solution(String str){
        //TIME COMPLEXITY 0(n2)

        for (int i = 0; i < str.length(); i++) {
            boolean seenDuplicate = false;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j) && (i != j)){
                    seenDuplicate = true;
                    break;
                }
            }
            if(!seenDuplicate) return str.charAt(i);
        }
        return '-';
    }

    static char solutionWithHashMap(String str){
        //TIME COMPLEXITY 0(n)
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) +1);
            } else{
                hashMap.put(c, 1);
            }
        }
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(hashMap.get(c) == 1)
                return c;
        }
        return '_';

    }
}
