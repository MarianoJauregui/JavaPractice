package generalPractices.codewars.kyu8;
/*
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 */
public class SentenceSmash {
    public static void main(String[] args){
        String[] words = {"hello", "world"};
        System.out.println(smash(words));
    }

    public static String smash(String... words){
        return String.join(" ", words);
    }
}
