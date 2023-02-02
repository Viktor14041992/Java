package HW3;
/**
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
 */

import java.util.ArrayList;
import java.util.List;

class task_3 {

public static void main(Integer[] args) {
    List list = new ArrayList<Integer>();
    list.add(100);
    list.add(10);
    list.add(120);
    list.add(158);
    list.add(56);
    list.add(14);

 System.out.println(list);
int max;
for (int i = 0; i< list.size()-1; i++){
    if (list.get(i) > list.get(i+1)){
        max = list.get(i);
    }
    else max = list.get(i+1)
}
    

int min;
for (int i = 0; i< list.size()-1; i++){
    if (list.get(i) < list.get(i+1)){
        min = list.get(i);
    }
    else min = list.get(i+1)
}
    
int average;
average = (min+max)/2;

System.out.println(list);
System.out.println(max);
System.out.println(min);
System.out.println(average);
}
}
