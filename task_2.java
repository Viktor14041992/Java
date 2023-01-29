package HW2;

/** 
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
*/
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

class task_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(task_3.class.getName ());

        sort(args, logger);
    }

    
    public static void sort(String[] args, Logger logger) {
            int [] mas = {12, 4, 15, 16, 7, 5, 1, 11};
     
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;
     
                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                    System.out.println(Arrays.toString(mas));
                    logger.log(Level.INFO, Integer.toString(i));
                }
            }
        }
}


