package HW_6;

import java.lang.System.Logger;

public class CalcTest {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        double one;
        double two;
        int action;


        do {
        System.out.print("Введите первое число:");
        one = readClass.readNextDouble();
        System.out.print("Введите второе число:");
        two = readClass.readNextDouble();

        Calc calc = new Calc(one, two, null);

        System.out.println("Выберите действие:");
        System.out.println("1. Сложить");
        System.out.println("2. Вычесть");
        System.out.println("3. Умножить");
        System.out.println("4. Разделить");
        System.out.println("5. Взять остаток");
        System.out.println("0. Выход из программы");
        System.out.println("Введитие номер пункта");

        action = (int) readClass.readNextDouble();

        switch (action){
            case 1: System.out.println(calc.add()); break;
            case 2: System.out.println(calc.sub()); break;
            case 3: System.out.println(calc.mult()); break;
            case 4: System.out.println(calc.dev()); break;
            case 5: System.out.println(calc.mod()); break;
            case 0: break;
            default: System.out.println("Вы неверно выбрали пункт");
        }
    }while (action != 0);
    }
}
