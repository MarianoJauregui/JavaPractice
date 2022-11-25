package generalPractices.codewars.kyu8;

public class DisemvowelTrolls {
    /*Trolls are attacking your comment section!
    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
    Your task is to write a function that takes a string and return a new string with all vowels removed.
    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
    * */
    public static void main(String[] args) {
        System.out.println(disemvowel("Mariano"));
        System.out.println(easiestWayToDoIt("Mariano"));
    }

    public static String disemvowel(String str){
        String newString = "";
        String vowels = "aeiouAEIOU";
        char ch;
        for(int i=0; i<str.length(); i++){
            int count = 0;
            ch = str.charAt(i);
            for(int j=0; j<vowels.length(); j++){
                if(ch == vowels.charAt(j))
                    count++;
            }
            if(count == 0){
                newString = newString + ch;
            }
        }
        return "String without vowels :" + newString;
    }

    public static String easiestWayToDoIt(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
