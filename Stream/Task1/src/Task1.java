import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Анна", 25, "female"));
        people.add(new Person("Иван", 30, "male"));
        people.add(new Person("Мария", 17, "female"));
        people.add(new Person("Елена", 22, "female"));
        people.add(new Person("Петр", 20, "male"));

        List<String> femaleAdultNames = people.stream()
                .filter(person -> person.getGender().equals("female"))
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Женщины старше 18 лет: " + femaleAdultNames);
    }
}