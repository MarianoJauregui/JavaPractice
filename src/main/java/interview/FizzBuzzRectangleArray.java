package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzRectangleArray {
    public static void main(String[] args){
        int[] array = new int[100];
//        for(int i=0; i<100; i++){
//            array[i] = i;
//        }
//        fizzBuzzProblem(array);

        int[][] test2 = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
        };

        List<Integer[]> result = solution(test2);
        for(Integer[] arrInteger : result){
            System.out.println(Arrays.deepToString(arrInteger));
        }
    }



    //coordenadas del 0
    public static List<Integer[]> solution(int[][] array){
        List<Integer[]> result = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == 0){
                    Integer[] aux = new Integer[4];
                    aux[0] = i;
                    aux[1] = j;

                    int auxIndexColumn = j;
                    while(auxIndexColumn < array[0].length &&
                            array[i][auxIndexColumn] == 0){
                        auxIndexColumn++;
                    }
                    int auxIndexRow = i;
                    while(auxIndexRow < array.length &&
                    array[auxIndexRow][auxIndexColumn-1] == 0){
                        auxIndexRow++;
                    }
                    aux[2] = auxIndexRow -1;
                    aux[3] = auxIndexColumn -1;
                    result.add(aux);

                    for(int k = aux[0]; k < aux[2] +1; k++){
                        for(int l = aux[1]; l < aux[3] +1; l++){
                            array[k][l] = 2;
                        }
                    }
                }
            }
        }
        return result;
    }
}
