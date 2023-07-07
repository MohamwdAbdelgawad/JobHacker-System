/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Arrays;
import java.util.Scanner;
import static week3.SecondLargestNumberOfArray.fillArrayFromUser;

/**
 *
 * @author Eng Mohamed
 */
public class SortArray {
    public static void main(String[] args) {
        int [] array = fillArrayFromUser();
        Arrays.sort(array);
        System.out.println("Sorted array is : " + Arrays.toString(array));
    }
         public static int [] fillArrayFromUser(){
        Scanner input = new Scanner(System.in);
          System.out.println("enter number of elements of array ");
        int arraySize= input.nextInt();
        
        int [] array1= new int [arraySize];
        
         System.out.println("enter elements of array ");
         for(int i =0; i<arraySize; i++)
         {
         int element = input.nextInt();
         array1[i]=element;
         }
         return array1;
    }
}
