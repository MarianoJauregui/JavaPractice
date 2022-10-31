package generalPractices.interviews;

public class StringReverse {
    public static void main(String[] args){
        String word = "Hola";
        System.out.println("Word in reverse: " + reverse(word));

        System.out.println("Word in reverse number two: " + reverseWord(word));
    }
    public static String reverse(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        input = stringBuilder.reverse().toString();
        return input;
    }

    public static String reverseWord(String input){
        char[] chars = input.toCharArray();
        int begin = 0;
        int end = chars.length -1;
        char temp;

        while(end > begin){
            temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            end--;
            begin++;
        }
        input = new String(chars);
        return input;
    }
}
