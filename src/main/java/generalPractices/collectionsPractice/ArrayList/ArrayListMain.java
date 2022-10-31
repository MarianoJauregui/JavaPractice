package main.java.generalPractices.collectionsPractice.ArrayList;

import java.util.ArrayList;

public class ArrayListMain {

    //Create a new ArrayList, add some elements and print the collection
    public static ArrayList<String> stringArrayList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i=0; i<= 10; i++){
            stringArrayList.add(String.valueOf(i));
        }
        System.out.println(stringArrayList);
    }
}
