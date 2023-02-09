package HW5;
/**
Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

import java.util.*;

public class task_3 {

public static void main(String[] args) {
              
int[] arr = {18,8,24,1,21,7,35};
System.out.println("Исходный массив:");  
System.out.println(Arrays.toString(arr));    
task_3 sort = new task_3(); 
sort.sort(arr,arr.length);
System.out.println("Отсортированный массив:");
System.out.println(Arrays.toString(arr));
}
        
public void sort(int[] arr,int size) {
              
     for(int i= size/2-1;i>=0;i--) {
          heap(arr,size,i);
     }
     for(int i=size-1;i>=0;i--) {
          int temp = arr[0];
          arr[0] = arr[i];
          arr[i] = temp;
          heap(arr,i,0);
     }
     }
        
public void heap(int[] arr,int size,int i) {  
     int largest = i; 
     int left = (2*i)+1; 
     int right = (2*i)+2; 
              
     if(left<size && arr[left]> arr[largest]) { 
          largest = left; 
     }
              
     if(right<size && arr[right]> arr[largest]) {
          largest = right; 
     }
              
     if(largest!= i) {
          int temp = arr[i];
          arr[i] = arr[largest];
          arr[largest] = temp;
          heap(arr,size,largest);
     }
}
}
