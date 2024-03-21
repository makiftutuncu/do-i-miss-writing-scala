case class Person(name: String, hobbies: Option[Set[String]])

object ScalaExample extends App:
    val people = List[Any](
        Person("John", Some(Set("Skiing", "Hiking"))),
        Person("Steve", Some(Set.empty)),
        Person(name = "Jack", hobbies = None),
    )

    people
        .collect:
            case p @ Person(_, hobbies) if hobbies.forall(_.isEmpty) => p
        .foreach: p =>
            println(s"${p.name} has no hobbies")
