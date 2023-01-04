package generalPractices.codewars.kyu7;

/*
Check to see if a string has the same amount of 'x's and 'o's.
The method must return a boolean and be case-insensitive.
The string can contain any char.
 */
public class ExesAndOhs {
    public static void main(String[] args){
        String str = "oooxxx";
        String str2 = "xxxXooOo";
        String str3 = "xxx23424esdsfvxXXOOooo";
        String str4 = "zssddd";
        String str5 = "XxxxooO";
        System.out.println(getXO(str));
    }
    public static boolean getXO (String str) {

        str = str.toLowerCase();

        return str.replace("o","").length() == str.replace("x","").length();
    }
}
