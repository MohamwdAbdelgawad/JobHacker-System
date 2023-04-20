/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Eng Mohamed
 */
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
         // code to know max number of the array
         if (element>=max_element) max_element=element;
         array[i]=element;
         }
             
         // using first method
         //int [] new_array=removeDuplicate(array,max_element);
         
         //using second method
         int [] new_array=removeDuplicate2(array);

         
    }
       //first method : remove duplicate except number 0 .. as default value of int
       public static int []removeDuplicate (int [] array, int maxOfArray){
       int [] frequancy_array= new int[maxOfArray+1];
       // fill frequancy array
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
       //second method remove all duplicates using set 
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
