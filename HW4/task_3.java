package HW4;
/**
Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.

Например:
5 4 3 - + => 5 1 + => 6
 */

import java.util.Scanner;
import java.util.Stack;

class task_3 {

private static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
    String str = in.nextLine();
    String[] strings = str.split(" ");
    Stack<Double> stack = new Stack<Double>();
    for (int i = 0; i < strings.length; i++){
        if (isNumber(strings[i])){
            stack.push(Double.parseDouble(strings[i]));
        }
        else
        {
            double tmp1 = stack.pop();
            double tmp2 = stack.pop();

            switch (strings[i])
            {
                case "+":
                    stack.push(tmp2 + tmp1);
                break;

                case "-":
                    stack.push(tmp2 - tmp1);
                break;

                case "*":
                    stack.push(tmp2 * tmp1);
                break;

                case "/":
                    stack.push(tmp2 / tmp1);
                break;
            }
        }
    }

    if (!stack.empty())
    {
        System.out.println(stack.pop());
    }
    else
    {
        System.out.println("Ошибка");
    }
}

public static boolean isNumber(String string){
    try{
        Double.parseDouble(string);
        return true;
    }catch (NumberFormatException ex)
    {
        return false;
    }
}
}
