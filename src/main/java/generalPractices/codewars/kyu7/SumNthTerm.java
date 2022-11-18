package generalPractices.codewars.kyu7;

/**
 * Your task is to write a function which returns the sum of following series up to nth term(parameter).
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 ...
 */
public class SumNthTerm {
    public static void main(String[] args) {
        System.out.println(seriesSum(2));
    }

    public static String seriesSum(int n){
        double sum = 0.0;

        for(int i=0; i<n; i++){
            sum+= 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);

    }
}
