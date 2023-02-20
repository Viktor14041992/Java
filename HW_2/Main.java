public class Main {
  public static void main(String[] args) {

        
      Person p = PersonCreator
      .getInst()
      .setFirstName("Владимир")
      .setLastName("Поляков")
      .setchildID(15)
      .Create();

    new PersonPrinter(p).print();

    Person p2 = PersonCreator
      .getInst()
      .setFirstName("Марина")
      .setLastName("Карпова")
      .setchildID(20)
      .Create();
      

    new NewPersonPrinter(p2).print();

  }
}
