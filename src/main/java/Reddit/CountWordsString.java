package Reddit;

public class CountWordsString {
    public static void main(String[] args){
        String str = "This is an example";
        System.out.println(countWords(str));
    }
    public static int countWords(String str){
        return str.split(" ").length;
    }
}
