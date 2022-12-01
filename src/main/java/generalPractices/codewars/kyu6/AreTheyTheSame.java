package generalPractices.codewars.kyu6;


import java.util.Arrays;

/**
 * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b))
 * that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears).
 * "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 */
public class AreTheyTheSame {

    public static void main(String[] args) {
        //These two would be valid arrays. So we would return true.
        int[] validArr1 = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] validArr2 = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(validArr1, validArr2));

        System.out.println(comp2(validArr1,validArr2));
    }

    public static boolean comp(int[] a, int[] b) {
     if(a ==null || b == null) return false;
     if(a.length != b.length) return false;

     for(int i = 0; i < b.length; i++){
         a[i] = a[i]*a[i];
     }
     Arrays.sort(a);
     Arrays.sort(b);

        return Arrays.equals(a, b);

    }

    public static boolean comp2(int[] a, int[] b) { // NOT OPTIMAL
        if ((a == null) || (b == null) || (a.length != b.length)) return false;

        Arrays.stream(a).map(n -> n * n);
        Arrays.sort(a);
        Arrays.sort(b);
        return (Arrays.equals(a, b));

    }
}
