package generalPractices.codewars.kyu7;
/*
Given two Arrays in which values are the power of each soldier, return true if you survive the attack or false if you perish.

CONDITIONS
Each soldier attacks the opposing soldier in the same index of the array. The survivor is the number with the highest value.
If the value is the same they both perish
If one of the values is empty(different array lengths) the non-empty value soldier survives.
To survive the defending side must have more survivors than the attacking side.
In case there are the same number of survivors in both sides, the winner is the team with the highest initial attack power.
If the total attack power of both sides is the same return true.
The initial attack power is the sum of all the values in each array.
 */

import static java.util.stream.IntStream.of;

// attackers: 1,3,5,7 - 2,9,9,7 - 10,10,1,1 - {} - 1,2,3
// defenders: 2,4,6,8 - 1,1,3,8 - 4,4,7,7 - 1,2,3 - {}
public class SurviveTheAttack {
    public static void main(String[] args){
        int[] arrAtk = {1,2,3};
        int[] arrDef = {};
        System.out.println(block(arrAtk, arrDef));
    }

    public static boolean block(int[] attackers, int[] defenders){
        int survived = defenders.length - attackers.length;

        for (int i = 0; i < Math.min(defenders.length, attackers.length); i++) {
            survived += Math.signum(defenders[i] - attackers[i]);
        }
        return survived > 0 || survived == 0 && of(defenders).sum() >= of(attackers).sum();
    }
}
