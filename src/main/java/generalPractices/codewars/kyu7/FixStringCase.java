package generalPractices.codewars.kyu7;

/**
 * In this Kata, you will be given a string that may have mixed uppercase and lowercase letters
 * and your task is to convert that string to either lowercase only or uppercase only based on:
 * make as few changes as possible.
 * if the string contains equal number of uppercase and lowercase letters,
 * convert the string to lowercase.
 */
public class FixStringCase {
    public static void main(String[] args){
        System.out.println(solve(""));
    }
    public static String solve(final String str){
        if(str.isEmpty())
            return "";

        char[] chars = str.toCharArray();

        int uppercase = 0;
        int lowercase = 0;

        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                uppercase++;
            } else lowercase++;
        }
        if(uppercase < lowercase)
            return str.toLowerCase();
        else if (uppercase == lowercase)
            return str.toLowerCase();

        else return str.toUpperCase();
    }

    public static String solve2(final String str){
        int lower = 0;
        for (Character c:str.toCharArray()) {
            if (Character.isLowerCase(c))
                lower++;
        }
        return str.length() - lower > lower ? str.toUpperCase() : str.toLowerCase();
    }

    public static String solve3(final String str){
        String upp = str.replaceAll("[^A-Z ]", "");
        String low = str.replaceAll("[^a-z ]", "");
        return (upp.length() > low.length() ?
                str.toUpperCase() : str.toLowerCase() ) ;

    }
}
