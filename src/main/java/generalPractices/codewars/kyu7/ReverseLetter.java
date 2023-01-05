package generalPractices.codewars.kyu7;
/*
Given a string str, reverse it and omit all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".
 */
public class ReverseLetter {
    public static void main(String[]args){
        String str = "krishan";
        String str2 = "ultr53o?n";
        System.out.println(reverseLetter(str2));
    }
    public static String reverseLetter(final String str){

        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();

    }
}
