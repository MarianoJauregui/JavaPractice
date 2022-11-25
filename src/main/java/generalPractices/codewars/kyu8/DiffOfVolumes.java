package generalPractices.codewars.kyu8;


public class DiffOfVolumes {
    public static void main(String[] args) {
        int[] arrayOne = {29,5,20};
        int[] arrayTwo = {19,25,16};
        System.out.println(findDifference(arrayOne,arrayTwo));
    }
    /*
    In this simple exercise, you will create a program that will take two lists of integers, a and b.
    Each list will consist of 3 positive integers above 0, representing the dimensions of cuboids a and b.
    You must find the difference of the cuboids' volumes regardless of which is bigger.
    For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20.
    Therefore, the function should return 8.
     */
    public static int findDifference(final int[] a, final int[] b){
        int sum1 = 1;
        int sum2 = 1;

        for(int i=0; i<= a.length -1; i++) {
            sum1 *= a[i];
        }
        for(int j=0; j<= b.length -1; j++){
            sum2 *= b[j];
        }
        return Math.abs(sum1 - sum2); //Returns the absolute positive value of an int value.
    }

    //Simpler solution
    public static int findDifference2(final int[] a, final int[] b){
        return Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);
    }

}
