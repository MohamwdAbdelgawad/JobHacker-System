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
public class SecondLargestNumberOfArray {
    public static void main(String[] args) {
        int [] array = fillArrayFromUser();
        Arrays.sort(array);
        System.out.println("Second largest number in the array is : "+array[array.length-2]);
        
    }
     public static int [] fillArrayFromUser(){
        Scanner input = new Scanner(System.in);
          System.out.println("enter number of elements of array ");
        int number1= input.nextInt();
        
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
