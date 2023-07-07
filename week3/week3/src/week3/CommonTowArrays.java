/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Eng Mohamed
 */
public class CommonTowArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // git first array
        System.out.println("first Array");
         System.out.println("enter number of elements of array ");
        int number1= input.nextInt();
        int [] array1=fillArray(number1);
        
         System.out.println("Second Array");
          System.out.println("enter number of elements of array ");
        int number2= input.nextInt();
        int [] array2= fillArray(number2);
   
         Set<Integer> set1 = new HashSet<>();
         for(int i=0; i<array1.length; i++) set1.add(array1[i]);
         
         Set<Integer> resultSet = new HashSet<>();
         for (int i = 0; i < array2.length; i++) {
            if(set1.contains(array2[i])) resultSet.add(array2[i]);
        }
         
         int [] new_array= new int [resultSet.size()];
         int i=0;
         for(int number :resultSet){
            new_array[i++]=number;
         }
         
         //print new array
          System.out.print("common numbers is : ");
         for (int j = 0; j < new_array.length; j++) {
             System.out.print(new_array[j]+" ");
        }

         
    }
    public static int [] fillArray(int number1){
        Scanner input = new Scanner(System.in);
    
        int [] array1= new int [number1];
        
         System.out.println("enter elements of array ");
         for(int i =0; i<number1; i++)
         {
         int element = input.nextInt();
         array1[i]=element;
         }
         return array1;
    }
}
