package HW_7;

public class app {

    public static void main(String[] args) {
      new Innerapp(null).write();
    }
  }
  
  interface IInterface {
    void print();
  }
  
  class Innerapp {
    IInterface v;
  
    public Innerapp(IInterface v) {
      this.v = v;
    }
  
    void write() {
      // try {

        if (v != null){
        v.print();
      // } catch (Exception ex)
    }
}
}
   
  