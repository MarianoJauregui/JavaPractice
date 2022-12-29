package generalPractices.codewars.kyu8;
/*
Given a string,
you have to return a string in which each character (case-sensitive) is repeated once.
 */
public class DoubleChar {
    public static void main(String[] args){
        String str = "Hello world";
        System.out.println(doubleChar(str));
    }

    public static String doubleChar(String s){
        StringBuilder stringBuilder = new StringBuilder();

            for(char ch : s.toCharArray()){
                stringBuilder.append(ch);
                stringBuilder.append(ch);
            }

        return stringBuilder.toString();
    }
}
