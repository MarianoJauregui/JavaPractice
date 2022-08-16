package generalPractices;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(disemvowel("M a   r i a  n o"));
    }
    static String disemvowel(String str){

        return str.replace(" ", "");

    }
}
