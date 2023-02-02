package HW3;

/** 
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
*/
// import java.util.Arrays;

class task_2 {
public static void main(String[] args) {
    int[] array = {12, 4, 15, 16, 7, 5, 1, 11, 22, 34, 21, 14, 76, 33};
    StringBuilder result = new StringBuilder();
    int i;
    System.out.print("Результат:  [");
         for (i = 0; i < array.length; i++) {
             if (array[i] % 2 != 0){
                 result.append(array[i]+ ", ");
            }
        }
        System.out.println(result + "]");
}
}