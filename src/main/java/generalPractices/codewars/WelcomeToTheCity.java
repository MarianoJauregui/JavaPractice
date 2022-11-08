package generalPractices.codewars;

import java.util.Arrays;

/*
    Create a method that takes as input a name, city, and state to welcome a person.
    Note that name will be an array consisting of one or more values that should be joined together with one space between each,
    and the length of the name array in test cases will vary.
 */
public class WelcomeToTheCity {
    public static void main(String[] args) {
        String[] arr = {"Mariano", "Dionisio", "Jauregui"};
        System.out.println(sayHello(arr, "Mercedes", "Buenos aires"));

        System.out.println(testingFormat(arr, "Jauregui", "Mercedes"));
    }

    public static String sayHello(String [] name, String city, String state){
        return String.format("Hello, %s! " +
                "Welcome to %s, %s!",
                String.join(" ", name)
                ,city
                ,state);
    }

    public static String testingFormat(String[] name, String lastName, String city){
        return String.format("Welcome home, %s. \n" +
                "You are the best %s, who lives in %s",
                String.join(" ", name) , lastName , city);

    }
}
