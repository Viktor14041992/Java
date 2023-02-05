package HW4;

/** 
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает 
первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
*/

import java.io.IOException;
import java.util.LinkedList;

class task_2 {


public static void main(String[] args) throws IOException {
    LinkedList<String> list = new LinkedList<String>();
          
    
    list.add("123");
    list.add("456");
    list.addLast("789"); // добавляем на последнее место
    list.addFirst("111"); // добавляем на первое место
System.out.println(list);
}
}
