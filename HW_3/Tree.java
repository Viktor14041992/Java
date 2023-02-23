package HW_3;
import java.util.ArrayList;
import java.util.LinkedList;


public class Tree {
    
  public static void main(String[] args) {
    var misha = new Person("Михаил");
    var dasha = new Person("Дарья");
    var alina = new NewPerson("Алина");
    var olga = new NewPerson("Ольга");
    var ivan = new NewPerson("Иван");
    var oleg = new NewPerson("Олег");
    var nikolas = new NewPerson("Николай");
    var vlad = new NewPerson("Влад");

    GeoTree gt = new GeoTree();
    gt.append(alina, misha);
    gt.append(alina, dasha);
    gt.append(dasha, vlad);
    gt.append(misha, olga);
    gt.append(misha, ivan);
    gt.append(ivan, oleg);

    GeoTree2 gt2 = new GeoTree2();
    gt.append(alina, vlad);
    gt.append(misha, oleg);

    NewGeoTree ngt = new NewGeoTree();
   

    System.out.println(          // вывод результатов исследования на консоль
        // new Research(gt).spend(alina, Relationship.parent));
        // new Research(gt2).spend(alina, Relationship.grandparent));
        new Research(gt).spend(olga, Relationship.children));
      

  }

}

enum Relationship {     //вид отношения людей
  parent,
  children,
  grandparent,
  grandchildren
}

interface Human {
  String getFullName();
}

class Person implements Human {

  private String fullName;

  public String getFullName() {
    return fullName;
  }

  public Person(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public String toString() {

    return getFullName();
  }
}

class NewPerson extends Person {

  String fName, lName;

  public NewPerson(String fullName) {
    super(fullName);
    fName = fullName;

  }

  public NewPerson(String firstName, String lastName) {
    super(firstName + lastName);
    fName = firstName;
    lName = lastName;
  }

  @Override
  public String getFullName() {

    var r = String.format("%s", fName);
    return fName;
  }

  @Override
  public String toString() {

    return getFullName();
  }
}

class Node {

  public Node(Person p1, Relationship re, Person p2) {
    this.p1 = p1;
    this.re = re;
    this.p2 = p2;
  }

  Person p1;
  Relationship re;
  Person p2;

  @Override
  public String toString() {
    return String.format("<%s %s %s>", p1, re, p2);
  }
}

interface PlusData {
  void append(Person parent, Person children);

  ArrayList<Node> getData();
}

interface PlusData2 {
  void append(Person grandparent, Person grandchildren);

  ArrayList<Node> getData2();
}



class GeoTree implements PlusData {
  private ArrayList<Node> tree = new ArrayList<>();

  public ArrayList<Node> getData() {
    return tree;
  }

  public void append(Person parent, Person children) {

    tree.add(new Node(parent, Relationship.parent, children));
    tree.add(new Node(children, Relationship.children, parent));
  }

}



class GeoTree2 implements PlusData2 {
  private ArrayList<Node> tree = new ArrayList<>();

  public ArrayList<Node> getData2() {
    return tree;
  }

  public void append(Person grandparent, Person grandchildren) {

    tree.add(new Node(grandparent, Relationship.grandparent, grandchildren));
    tree.add(new Node(grandchildren, Relationship.grandchildren, grandparent));
  }

}

class NewGeoTree implements PlusData {
  private LinkedList<Node> tree = new LinkedList<>();

  @Override
  public ArrayList<Node> getData() {

    ArrayList<Node> res = new ArrayList<>();

    for (Node node : tree) {
      res.add(node);
    }

    return res;
  }

  public void append(Person parent, Person children) {

    tree.add(new Node(parent, Relationship.parent, children));
    
  }
}

class FileList implements PlusData {
  @Override
  public void append(Person parent, Person children) {

  }

  @Override
  public ArrayList<Node> getData() {
    return null;
  }
}

class FileList2 implements PlusData2 {
  @Override
  public void append(Person grandparent, Person grandchildren) {

  }

  @Override
  public ArrayList<Node> getData2() {
    return null;
  }
}

// class Repository {
// PlusData pd;

// public Repository(PlusData plusData) {
// pd = plusData;
// }

// public void appandPair(Person p, Person c) {
// pd.append(p, c);
// }
// }

class Research {
  ArrayList<Node> tree;

  public Research(PlusData pd) {
    tree = pd.getData();
  }

  public ArrayList<Person> spend(Human p, Relationship re) {

    var result = new ArrayList<Person>();
    for (Node t : tree) {
      
      if (t.p1.getFullName() == p.getFullName()
          && t.re == re) {
        result.add(t.p2);
      }
    }

    return result;
  }
}


class Printer {

}