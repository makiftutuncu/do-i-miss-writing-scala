import org.jetbrains.annotations.Nullable;
import java.util.*;

record Person(String name, @Nullable Set<String> hobbies) {}

void main() {
    List<Object> people = List.of(
        new Person("John", Set.of("Skiing", "Hiking")),
        new Person("Steve", Set.of()),
        new Person("Jack", null)
    );

    people
        .stream()
        .filter(p -> p instanceof Person(var _, var h) && (h == null || h.isEmpty()))
        .forEach(p -> System.out.println(STR."\{((Person) p).name()} has no hobbies"));
}
