package generalPractices.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,4,5,0,2,10};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] array){

        int size = array.length;

        //Ejecutamos el bucle dos veces, uno para recorrer el array, y el otro para comparaciones
        for (int i = 0; i < size; i++) {

            //Se ordena un registro de los cambios
            boolean swapped = true;
            for (int j = 0; j < size - 1; j++) {

                //Para ordenar en orden descendiente cambiar > por <
                if(array[j] > array[j + 1]) {

                    //Intercambio
                    int temp = array[j]; //temp podría llamarse variableTemporal
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = false;
                }
            }
            //Si no ha habido intercambio en la ultima comparacion, entonces el array esta ordenado.
            if ( swapped == true) break;
        }
        return array;
    }
}
