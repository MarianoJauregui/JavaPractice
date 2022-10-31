package generalPractices.sortingAlgorithms;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] array = {9,5,3,7,19,6,-4,150};
        System.out.println(Arrays.toString(quickSort(array, 0, 7)));
    }

    public static int[] quickSort(int[] A, int izq, int der){

        int pivot = A[izq]; //Tomamos el primer elemento como pivote
        int i = izq;         // i realiza la busqueda de izq a der
        int j = der;        // j realiza la busqueda de der a izq
        int aux;

        while(i < j){                               //mientras no se crucen las busquedas
            while (A[i] <= pivot && i < j) i++;    //busca elemento mayor que pivote
            while (A[j] > pivot) j--;              //busca elemento menor que pivote
            if(i < j){                            //si no se han cruzado
                aux = A[i];                       //los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];                  //se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivot;                   //los menores a su izquierda y los mayores a su derecha

        if(izq < j-1){
            quickSort(A, izq,j-1); //Ordenamos subarray izquierdo
        }

        if(j+1 < der){
            quickSort(A, j+1, der); //Ordenamos subarray derecho;
        }
        return A;
    }

}
