package generalPractices.interviews;


/**
 * * if you have number 15 make 1+5 as output
 *
 *
 * * String asdfGGkjcl, split it on the doubled symbol and print length of both strings
 */
public class Number15AndString {
    public static void main(String[] args) {
        System.out.println(intAsNumber(100));
        splitString("asdfGGksfgthjcl");
    }
    public static String intAsNumber(int number){
        StringBuilder str = new StringBuilder();

        char[] chars = String.valueOf(number).toCharArray();

        for (char aChar : chars) {
            str.append(aChar).append("+");
        }

        return str.substring(0, str.length() -1);

    }

    public static void splitString(String str){
            String[] out = str.split("(\\w)\\1+");
            int firstLength = 0;
            int secondLength = 0;

        for (int i = 0; i < out.length; i++) {
            firstLength += out[i].length();
            i++;
            secondLength += out[i].length();
        }
        System.out.println("Fist half length -> " + firstLength);
        System.out.println("Second half length -> " + secondLength);


        }

    }

