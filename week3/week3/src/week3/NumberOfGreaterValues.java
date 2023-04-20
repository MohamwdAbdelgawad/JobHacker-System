/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author Eng Mohamed
 */
public class NumberOfGreaterValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value to be cheaced");
        int value = input.nextInt();
        System.out.println("enter number of elements");
        int number = input.nextInt();
        
        int [] array= new int [number];
        
         System.out.println("enter elements");
         int result=0;
         for(int i =0; i<number; i++)
         {
                    int element = input.nextInt();
                    if(element>value) result++;
                    array[i]=element;
         
         }
         System.out.println("result is  : "+ result);
    }
}
