import java.util.Set;

public class Person {
    private String name;
    private Set<String> hobbies;

    public Person(String name, Set<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }
}
