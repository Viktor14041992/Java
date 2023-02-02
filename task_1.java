package HW3;
/**
 * Реализовать алгоритм сортировки слиянием.
 */

 public class task_1 {
 
     public static void main(String[] params) {
         int[] array = new int[] {63,40,74,39,52,17,25,59,46,79,56,34};
         System.out.println(arrayToString(array));
         array = mergeSort(array);
         System.out.println(arrayToString(array));
     }
 
     public static int[] mergeSort(int[] array) {     //сортировка
         int[] tmp;   //массив переменная
         int[] currentSrc = array;        //массив источник
         int[] currentDest = new int[array.length]; //массив приёмник
 
         int size = 1;  //текущий размер сливаемых массивов
         while (size < array.length) {
             for (int i = 0; i < array.length; i += 2 * size) {
                 merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
             }
 
             tmp = currentSrc;
             currentSrc = currentDest;
             currentDest = tmp;
 
             size = size * 2;
 
             System.out.println(arrayToString(currentSrc)); //вывод на экран каждый шаг сортировки
         }
         return currentSrc;
     }
 
     private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,   //слияние двух массивов в один
                               int destStart, int size) {
         int index1 = src1Start;  //начало подмассива 1
         int index2 = src2Start;  //начало подмассива 2
 
         int src1End = Math.min(src1Start + size, src1.length);  //конец подмассива 1
         int src2End = Math.min(src2Start + size, src2.length);  //конец подмассива 2
 
         if (src1Start + size > src1.length) {
             for (int i = src1Start; i < src1End; i++) {
                 dest[i] = src1[i];
             }
             return;
         }
 
         int iterationCount = src1End - src1Start + src2End - src2Start;   //кол-во итераций цикла
 
         for (int i = destStart; i < destStart + iterationCount; i++) {
             if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                 dest[i] = src1[index1];
                 index1++;
             } else {
                 dest[i] = src2[index2];
                 index2++;
             }
         }
     }
 
     private static String arrayToString(int[] array) {
         StringBuilder sb = new StringBuilder();
         sb.append("[");
         for (int i = 0; i < array.length; i++) {
             if (i > 0) {
                 sb.append(", ");
             }
             sb.append(array[i]);
         }
         sb.append("]");
         return sb.toString();
     }
 }
    
