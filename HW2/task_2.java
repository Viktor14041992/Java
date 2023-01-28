package HW2;

/** 
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
*/
// import java.util.logging.Level;
// import java.util.logging.Logger;
import java.util.Arrays;

class task_3 {
    // public static void main(String[] args) {
    //     Logger logger = Logger.getLogger(task_3.class.getName ());

        
    //     printNumbers (logger);
        
    // }

    
    public static void sort(String[] args) {
            int [] mas = {11, 3, 14, 16, 7};
     
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
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
    
//     private static void printNumbers (Logger logger) {
//         for (int i = 0; i < 10; i++) {
//             logger.log(Level.INFO, Integer.toString(i));
//         }
//     }
// }