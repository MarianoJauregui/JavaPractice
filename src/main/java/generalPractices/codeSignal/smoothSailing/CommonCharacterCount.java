package generalPractices.codeSignal.smoothSailing;

import java.util.ArrayList;


/*
For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
 */
public class CommonCharacterCount {
    public static void main(String[] args) {
        String str1 = "aabcc";
        String str2 = "adcaa";
        System.out.println(solution(str1, str2));
    }


        //THIS DOESN'T WORK FOR THIS PARTICULAR PROBLEMS. IT DOES NOT COUNT THE "aa" AS A CHAR
        static int solution (String s1, String s2){
            int counter = 0;

            for(int i = 0; i < s1.length(); i++){
                if(s2.contains(String.valueOf(s1.charAt(i)))){
                    counter++;
                    s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
                }
            }

            return counter;
        }
    }

