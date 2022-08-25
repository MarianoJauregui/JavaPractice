package generalPractices.leetCode;

import static java.lang.Math.max;

public class RicherCostumerWealth {
    public static void main(String[] args) {
        int[][] arrayExample = {{1,2,3}, {4,6,0}};
        System.out.println(maximumWealth(arrayExample));

    }
    /*
    You are given an m x n integer grid accounts where accounts[i][j]
    is the amount of money the i customer has in the j bank. Return the wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.
     */

        public static int maximumWealth(int[][] accounts) {
            int maxWealth = 0;
            int cols = accounts[0].length;
            for (int[] account : accounts) {
                int wealth = 0;
                for (int j = 0; j < cols; j++) {
                    wealth += account[j];
                }
                maxWealth = max(maxWealth, wealth);
            }
            return maxWealth;

        }

}
