package generalPractices.codeSignal.edgeOfTheOcean;

public class matrixElementSum {
    public static void main(String[] args) {
        int[][] twoDimArray = { {0,1,1,2},
                                {0,5,0,0},
                                {2,0,3,3} };

        System.out.println(solution(twoDimArray));
    }
    /*¨
    After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost,
    and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious,
    they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

    Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum
    of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
     */
    public static int solution(int[][] matrix){
        int sum = 0;
        //We start iterating from left to right to check first if there is a 0.
        for(int leftToRight = 0; leftToRight < matrix[0].length; leftToRight++){
            for(int upToDown = 0; upToDown < matrix.length; upToDown++){
                if(matrix[upToDown][leftToRight] == 0){
                    break;
                }
                sum+= matrix[upToDown][leftToRight];
            }
        }
        return sum;
    }
}
