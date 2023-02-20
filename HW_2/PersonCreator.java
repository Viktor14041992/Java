import java.time.LocalDate;
import java.time.Month;

public class PersonCreator {

  private static PersonCreator inst;

  public static PersonCreator getInst() {
    if (inst == null)
      inst = new PersonCreator();
    inst.init();
    return inst;
  }

  private PersonCreator() {
  }

  private void init() {
    temp = new Person();

    temp.personID = 12;
    temp.firstName = "Александр";
    temp.lastName = "Овечкин";
    temp.dayOfBirth = LocalDate.of(1955, Month.MARCH, 12);
    temp.childID = 13;
    // temp.fatherID = 11;
    // temp.motherID = 10;
  }

  Person temp;

  public PersonCreator setPersonID(int personID) {
    temp.personID = personID;
    return this;
  }

  public PersonCreator setFirstName(String firstName) {
    temp.firstName = firstName;
    return this;
  }

  public PersonCreator setLastName(String lastName) {
    temp.lastName = lastName;
    return this;
  }

  public PersonCreator setdayOfBirth(LocalDate dayOfBirth) {
    temp.dayOfBirth = dayOfBirth;
    return this;
  }

  public PersonCreator setchildID(int childID) {
    temp.childID = childID;
    return this;
  }

  // public PersonCreator setfatherID(int fatherID) {
  //   temp.fatherID = fatherID;
  // }

  // public PersonCreator setmotherID(int motherID) {
  //   temp.motherID = motherID;
  // }
  
  public Person Create() {
    return temp;
  }
}
