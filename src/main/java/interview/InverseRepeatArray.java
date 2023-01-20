package interview;

public class InverseRepeatArray {
    public static void main(String[] args){
        String input = "3[asdf]"; // asdfasdfasdf
        System.out.println(repeat(input));

        String input2 = "aaaaabbbbcccc";
        System.out.println(solution(input2));
    }

    static String repeat(String str){
        String countSlice = str.substring(0, str.indexOf("["));
        String charSlice = str.substring(str.indexOf("[") +1, str.indexOf("]"));

        int count = Integer.parseInt(countSlice);

        return charSlice.repeat(count);
    }

    public static String solution(String pattern) {
        StringBuilder encoded = new StringBuilder();

        int counter = 0;
        char lastLetter = pattern.charAt(0);

        for (char currentLetter : pattern.toCharArray()) {

            if (currentLetter != lastLetter) {
                encoded.append(lastLetter);
                encoded.append(counter);
                counter = 1;
                lastLetter = currentLetter;
            } else {
                counter++;
            }
        }
        if (counter != 0) {
            encoded.append(lastLetter);
            encoded.append(counter);
        }
        return encoded.toString();
    }
}
