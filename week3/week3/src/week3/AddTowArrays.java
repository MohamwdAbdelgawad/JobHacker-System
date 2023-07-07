/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Eng Mohamed
 */
public class AddTowArrays {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter number of elements of array ");
          int number1= input.nextInt();
          
          System.out.println("First array");
          int  [] array1 = fillArrayFromUser(number1);
          
         System.out.println("Second array");
          int  [] array2 = fillArrayFromUser(number1);
          
          int [] result = new int[number1];
          for(int i =0; i<number1; i++) result[i]= array1[i]+ array2[i];
          System.out.println("New array is : "+ Arrays.toString(result));
          

          
    }
    
         public static int [] fillArrayFromUser(int number1){
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
