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
public class CountConsecutiveElements {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements of array ");
        int elementNumber= input.nextInt();
        int [] array = fillArrayFromUser(elementNumber);
        int count = getCount(array, elementNumber);
     
        System.out.println("Number of Consecutive elements is : " + count);
    }
         public static int [] fillArrayFromUser(int arraySize){
        Scanner input = new Scanner(System.in);
       
        int [] array1= new int [arraySize];
        
         System.out.println("enter elements of array ");
         for(int i =0; i<arraySize; i++)
         {
         int element = input.nextInt();
         array1[i]=element;
         }
         return array1;
    }
         public static int getCount(int [] array , int elementNumber){
         int count = 0 ;
         for (int i = 0; i < elementNumber-1; i++) {
            if(array[i]+1== array[i+1]) count++;
        }
         return count;
         }
}




