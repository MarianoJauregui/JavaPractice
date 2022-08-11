package generalPractices.streamPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        var underAge = people.stream()
                .filter(person -> person.getAge() < 18).toList();
        System.out.println("Filter method -> " + underAge);

        //Sort method
        var sortPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge)).toList();
        sortPeople.forEach(System.out::println);

        //All match method
        boolean allMatch = sortPeople.stream().
                allMatch(person -> person.getAge() > 8);
        System.out.println("All match method -> " + allMatch);

        //Any match method
        var anyMatch = sortPeople.stream().anyMatch(person -> person.getAge() < 10);
        System.out.println("Any match method -> " + anyMatch);

        //Max method
        var maxMethod = people.stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println("Max method -> " + maxMethod);




    }
    static List<Person> getPeople(){
        return List.of(
                new Person("Mariano", "Martinez", 27),
                new Person("Augusto", "Turco", 39),
                new Person("José" , "Gomez", 58),
                new Person("Sofia", "Gonzalez", 15),
                new Person("Marta", "Latapia", 98)
        );
    }
}
