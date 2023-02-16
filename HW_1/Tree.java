package HW_1;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;

/**
 * App
 */
public class Tree {
  public static void main(String[] args) {
    PeopleRepository peoples = new PeopleRepository();
    peoples.create(new People(0, "Иванов Алексей Витальевич", "12 01 1965", "муж.", "null", "null", "2"));
    peoples.create(new People(1, "Стрельникова Нателла Валентиновна", "10 02 1963", "жен.", "null","null", "2"));
    peoples.create(new People(2, "Иванов Борис Алексеевич", "10 02 1991",  "муж.", "0", "1", "null"));
    peoples.create(new People(3, "Борисова Анжелла Витальевна", "15 07 1954", "жен.", "null","null", "4"));
    peoples.create(new People(4, "Борисов Денис Александрович", "05 10 1980", "муж.", "0", "1", "null"));

    ChildRepository child = new ChildRepository();
    
    child.create(new child(2, "Иванов Борис Алексеевич", "10 02 1991",  "муж.", "0", "1", "null"));
    child.create(new child(4, "Борисов Денис Александрович", "05 10 1980", "муж.", "0", "1", "null"));

  
    ParentsRepository parents = new ParentsRepository();
    Parents.create(new Parents(0, "Иванов Алексей Витальевич", "12 01 1965", "муж.", "null", "null", "2"));
    Parents.create(new Parents(1, "Стрельникова Нателла Валентиновна", "10 02 1963", "жен.", "null","null", "2"));
    Parents.create(new Parents(3, "Борисова Анжелла Витальевна", "15 07 1954", "жен.", "null","null", "4"));
 

    Repo repo = new Repo(peoples, child);
    var res = repo.readCommonList();
    System.out.println(res);

    Repo repo = new Repo(peoples, parents);
    var res = repo.readCommonList();
    System.out.println(res);

  }
}

class People {
  public int id;
  public String fio;
  public String Birthday;
  public String gender;
  public int fathers_id;
  public int mothers_id;
  public int child_id;

  public People(int id, String fio, String Birthday, String gender, int fathers_id, int mothers_id, int child_id) {
    this.id = id;
    this.fio = fio;
    this.Birthday = Birthday;
    this.gender = gender;
    this.fathers_id = fathers_id;
    this.mothers_id = mothers_id;
    this.child_id = child_id;
  }
}

class Parents {
  public int whoseParents;
  public String parents_fio;
  public String parents_Birthday;
  public String parents_gender;
  public String parents_comments;


  public Parents(int whoseParents, String parents_fio, String parents_Birthday, String parents_gender, String parents_comments) {
    this.whoseParents = whoseParents;
    this.parents_fio = parents_fio;
    this.parents_Birthday = parents_Birthday;
    this.parents_gender = parents_gender;
    this.parents_comments = parents_comments;
  }

    @Override
    public String toString() {
  
      return String.format("child: %s birthday: %s gender: %s com: %s",parents_fio, parents_Birthday, parents_gender, parents_comments);
    }
  }


class Child {
  public int whosechild;
  public String child_fio;
  public String child_Birthday;
  public String child_gender;
  public String child_comments;

  public Child(int whosechild, String child_fio, String child_Birthday, String child_gender, String child_comments) {
    this.whosechild = whosechild;
    this.child_fio = child_fio;
    this.child_Birthday = child_Birthday;
    this.child_gender = child_gender;
    this.child_comments = child_comments;
  }

  @Override
  public String toString() {

    return String.format("child: %s birthday: %s gender: %s com: %s", child_fio, child_Birthday, child_gender, child_comments);
  }
}

class PeopleRepository {

  ArrayList<People> db = new ArrayList<>();


  public ArrayList<People> getDb() {
    return db;
  }

  void create(People current) {
    db.add(current);
  }

  People read(int id) {
    return db.get(id);
  }

  People read(String fl) {
    for (People people : db) {
      if (people.fio.equals(fl))
        return people;
    }
    return null;
  }
}


class ChildRepository= new ArrayList<>();

    public ArrayList<Child> getDb() {
    return db;
  }

  void create(Child current) {
    db.add(current);
  }

  ArrayList<Child> read(int id) {
    ArrayList<Child> t = new ArrayList<>();

    for (Child child : db) {
      if (child.whosechild == id) {
        t.add(child);
      }
    }
    return t;
  }


class ParentsRepository {

  void create(Parents current) {

  }

  Parents read() {
    return null;
  }
}

class Repo {
  PeopleRepository pr;
  ParentsRepository par;
  ChildRepository cr;

  public Repo(PeopleRepository pr, ParentsRepository par, ChildRepository cr) {
    this.pr = pr;
    this.par = par;
    this.cr = cr;
  }

  StringBuilder readCommonList() {
    StringBuilder sb = new StringBuilder();

    for (People item : pr.getDb()) {
      sb.append(String.format("%s %s %s\n", item.fio, item.Birthday, par.read(item.id)));
    }

    return sb;
  }
}



