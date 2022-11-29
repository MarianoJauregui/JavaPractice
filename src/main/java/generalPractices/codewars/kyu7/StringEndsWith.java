package generalPractices.codewars.kyu7;

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("sumo", "omo"));


    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
