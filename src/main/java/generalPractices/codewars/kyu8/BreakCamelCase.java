package generalPractices.codewars.kyu8;




public class BreakCamelCase {
    public static void main(String[] args) {
        String testString = "camelCasing";
        String testString2 = "ILoveYou";

        System.out.println(camelCase(testString));
        System.out.println(camelCase(testString2));

        System.out.println(camelCaseFast(testString));
        System.out.println(camelCaseFast(testString2));

    }
    /*
    Complete the solution so that the function will break up camel casing, using a space between words.
    Example:
    "camelCasing"  =>  "camel Casing"
    "identifier"   =>  "identifier"
    ""             =>  ""
     */
    public static String camelCase(String input) {
        if(input.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for(int i=0; i < input.length()-1; i++){
            result.append(chars[i]);
            if(Character.isUpperCase(chars[i+1])){
                result.append(" ");
            }
        }
        return result.toString() + chars[input.length()-1];
    }

    public static String camelCaseFast(String input){
        //This method puts a space if the first letter is on uppercase. Not so good in my opinion. But faster.
        return input.replaceAll("([A-Z])", " $1");
    }

}
