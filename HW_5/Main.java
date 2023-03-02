package HW_5;

public class Main {

  public static void main(String[] args) {
   
    Calc c = new Calc(new ThisLogger());

    System.out.println(c.sub(new Operand(1), new Operand(2)));
    System.out.println(c.div(new Operand(1), new Operand(2)));
    System.out.println(c.div(new Operand(1), new Operand(2)));
    System.out.println(c.sub(new Operand(1), new Operand(2)));
    System.out.println(c.mult(new Operand(1), new Operand(2)));

  }
}
