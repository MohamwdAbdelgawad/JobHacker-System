
package week3;
import java.util.*;
import java.util.Scanner;

public class removeDuplicates {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of elements");
        int number = input.nextInt();
        
        int [] array= new int [number];
         System.out.println("enter elements");
         int max_element=0;
         for(int i =0; i<number; i++)
         {
         int element = input.nextInt();
         if (element>=max_element) max_element=element;
         array[i]=element;
         }
             
      
         int [] new_array=removeDuplicate2(array);

         
    }
       public static int []removeDuplicate (int [] array, int maxOfArray){
       int [] frequancy_array= new int[maxOfArray+1];
       for(int i =0; i<array.length; i++)
         {
         frequancy_array[array[i]]++;
         }
       for(int i =0; i<array.length; i++)
         {
                if(frequancy_array[array[i]]>1) {
                
                frequancy_array[array[i]]--;
                array[i]=0;
                }
         }
       return array;
       }
        public static int []removeDuplicate2 (int [] array){
            Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int new_size=set.size();
        int[] new_Array = new int[new_size];
        int i = 0;
        for (int num : set) {
            new_Array[i++] = num;
        }
        return new_Array;
        }
}
