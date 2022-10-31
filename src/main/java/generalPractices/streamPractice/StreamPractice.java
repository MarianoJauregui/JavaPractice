package generalPractices.streamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Person> people = getPeople();
        // Different ways of looping through Collections.

        // Imperative approach
        List<Person> older = new ArrayList<>();
        for(Person person : people){
            if(person.getAge() > 18){
                older.add(person);
            }
        }
        // older.forEach(System.out::println);

        //Declarative approach using Stream API

        // Filter method
        List<Person> underAge = people.stream()
                .filter(person -> person.getAge() < 18).toList();
        System.out.println("Filter method -> " + underAge);

        //Sort method
        List<Person> sortPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge)).toList();
        sortPeople.forEach(System.out::println);

        //All match method
        boolean allMatch = sortPeople.stream().
                allMatch(person -> person.getAge() > 8);
        System.out.println("All match method -> " + allMatch);

        //Any match method
        boolean anyMatch = sortPeople.stream().anyMatch(person -> person.getAge() < 10);
        System.out.println("Any match method -> " + anyMatch);

        //Max method
        Optional<Person> maxMethod = people.stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println("Max method -> " + maxMethod);

        //Group method
        Map<Integer, List<Person>> groupMethod = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        groupMethod.forEach((age, people1) -> {
            System.out.println("Sorted by age");
            people1.forEach(System.out::println);
            System.out.println();
        });

        //Combination of methods
        //We are trying to find the oldest Martinez on the list
        Optional<String> oldestMartinez = people.stream()
                .filter(person -> person.getLastName().equals("Martinez"))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestMartinez.ifPresent(System.out::println);




    }
    static List<Person> getPeople(){
        return List.of(
                new Person("Mariano", "Martinez", 27),
                new Person("Augusto", "Turco", 10),
                new Person("José" , "Gomez", 58),
                new Person("Sofia", "Gonzalez", 27),
                new Person("Marta", "Martinez", 98)
        );
    }
}
