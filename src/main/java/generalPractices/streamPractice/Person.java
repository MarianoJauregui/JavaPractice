package generalPractices.streamPractice;

public class Person {
    private final String name;
    private final String lastName;
    private final int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Person -> " + "Name: " + name + " \n" +
                "Last Name: " + lastName + "\n" +
                "Age : " + age;
    }


}
