
public class NewPersonPrinter extends PersonPrinter {
  public NewPersonPrinter(Person p) {
    super(p);
  }


  @Override
  public void print() {

    System.out.println(String.format("%s %s %s %s %s %s %s",
      person.personID,
      person.firstName,
      person.lastName,
      person.dayOfBirth,
      person.childID
      // person.fatherID,
      // person.motherID
      ));
  }
}