package generalPractices.codewars;

import java.util.Arrays;

/*
Task
Given an array of positive integers (the weights of the people), return a new array/tuple of two integers,
where the first one is the total weight of team 1, and the second one is the total weight of team 2.
 */
public class RowWeights {
    public static void main(String[] args) {
        int[] arr = {13,27,49};
        System.out.println(Arrays.toString(rowWeights(arr)));

    }
    public static int[] rowWeights (final int[] weights) {
        int sumTeamOne = 0;
        int sumTeamTwo = 0;
        for (int i = 0; i < weights.length; i++) { //si pongo <= debería poner length -1.
            if(i % 2 == 0)
                sumTeamOne += weights[i];
            if(i % 2 != 0)
                sumTeamTwo += weights[i];
        }
        return new int[]{sumTeamOne, sumTeamTwo};
    }
}
