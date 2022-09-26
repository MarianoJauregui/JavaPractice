package generalPractices.codewars;

public class DetectPangram {
    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(check(pangram1));
    }
    /*
    A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog"
    is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
    Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     */
    public static boolean check(String sentence){
        boolean[] alphabeat = new boolean[26];
        int index = 0;
        int flag = 1;

        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z'){
                index = sentence.charAt(i) - 'A';
            } else if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'z'){
                index = sentence.charAt(i) - 'a';
            }
            alphabeat[index] = true;
        }
        for(int i = 0; i <= 25; i++) {
            if (!alphabeat[i]) {
                flag = 0;
                break;
            }
        } if(flag == 1)
            return true;
        else return false;
    }

}
