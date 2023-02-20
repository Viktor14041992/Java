public class PersonPrinter {
  Person person;

  public PersonPrinter(Person p) {
    person = p;
  }

  public void print() {

    System.out.println(String.format("%s %s %s %s %s",

    person.personID,
    person.firstName,
    person.lastName,
    person.dayOfBirth,
    person.childID
    ));

  }
}
