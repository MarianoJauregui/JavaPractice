package generalPractices.codeSignal.edgeOfTheOcean;


import java.util.stream.IntStream;

public class AdjacentElementsProduct {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(solution(inputArray));
        System.out.println(solution2(inputArray));
    }
    // Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
    public static int solution(int[] inputArray){
        return IntStream.range(1, inputArray.length).map(i -> inputArray[i] * inputArray[i-1]).max().getAsInt(); // ?????????????
    }

    public static int solution2(int[] inputArray){
        int product = inputArray[0] * inputArray[1];
        for(int i=1; i < inputArray.length-1; i++){
            int temp = inputArray[i] * inputArray[i+1];
            if(temp > product)
                product = temp;
        }
        return product;
    }

}
