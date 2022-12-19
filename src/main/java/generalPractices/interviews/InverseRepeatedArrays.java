package generalPractices.interviews;

public class InverseRepeatedArrays {
    public static void main(String [] args){
        String str = "aaabbbccc";
        System.out.println(solution(str));
        System.out.println(solution2(str));
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

    public static String solution2(String pattern){
        StringBuilder encoded = new StringBuilder();

        int counter = 0;
        char lastLetter = pattern.charAt(0);
        for (char currentLetter : pattern.toCharArray()) {

            if (currentLetter != lastLetter) {
                encoded.append(counter);
                encoded.append("[");
                encoded.append(lastLetter);
                encoded.append("]");
                counter = 1;
                lastLetter = currentLetter;
            } else {
                counter++;
            }
        }
        if (counter != 0) {
            encoded.append(counter);
            encoded.append("[");
            encoded.append(lastLetter);
            encoded.append("]");

        }
        return encoded.toString();
    }
}
