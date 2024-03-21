import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaExample {
    public static void main(String[] args) {
        List<Object> people = new ArrayList<>();

        Set<String> hobbies = new HashSet<>();
        hobbies.add("Skiing");
        hobbies.add("Hiking");

        people.add(new Person("John", hobbies));
        people.add(new Person("Steve", new HashSet<>()));
        people.add(new Person("Jack", null));

        for (Object p : people) {
            if (p instanceof Person) {
                Person person = (Person) p;
                if (person.getHobbies() == null || person.getHobbies().isEmpty()) {
                    System.out.println(person.getName() + " has no hobbies");
                }
            }
        }
    }
}
