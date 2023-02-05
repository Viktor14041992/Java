package HW4;
/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */


import java.util.LinkedList;
import java.util.Stack;

public class task_1 {
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(123);
    list.add(456);
    list.add(789);
    list.add(987);
    list.add(654);

    System.out.println("Исходный лист:");
    System.out.println(list);
                    
    Stack<Integer> stack = new Stack<>();
    stack.addAll(list);
                    
    LinkedList<Integer> reverse = new LinkedList<>();
    while (!stack.empty())
        reverse.add(stack.pop());
            
        System.out.println("Перевернутый лист:");
        System.out.println(reverse);
    }
}
    


        

   