package generalPractices.codewars;

public class BasicMathematicalOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("/",2,2));
    }
    public static Integer basicMath(String op, int v1, int v2){
        int result = 0;
        switch (op) {
            case "+" -> {
                result = v1 + v2;
            }
            case "-" -> {
                result = v1 - v2;
            }
            case "*" -> {
                result = v1 * v2;
            }
            case "/" -> {
                result = v1 / v2;
            }
        }
        return result;
    }
}
