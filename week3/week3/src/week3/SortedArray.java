/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eng Mohamed
 */
public class SortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of elements");
        int number = input.nextInt();
        
        int [] array= new int [number];
        
         System.out.println("enter elements");
         // fill array
         for(int i =0; i<number; i++)
         {
         int element = input.nextInt();
         array[i]=element;
         }
         // check if array is sorted
         boolean isSorted=true;
         for(int i =1; i<number; i++)
         {
                if(array[i]<array[i-1]){
                isSorted=false;
                break;
                }
         }
         if(isSorted) System.out.println("array is sorted");
         else System.out.println("array is not sorted");
    }
}
