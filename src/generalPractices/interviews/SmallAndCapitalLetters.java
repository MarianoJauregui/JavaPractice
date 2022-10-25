package generalPractices.interviews;

public class SmallAndCapitalLetters {
    public static void main(String[] args){
        howMany("Mariano Jauregui");
    }
    public static void howMany(String word){
        int capitalLetters = word.replaceAll("[^A-Z]", "").length();
        int nonCapitalLetters = word.replaceAll("[^a-z]", "").length();

        System.out.println("The number of capital letters on this word is: " + capitalLetters);
        System.out.println("The number of non capital letters on this word is: " + nonCapitalLetters);
    }
}
