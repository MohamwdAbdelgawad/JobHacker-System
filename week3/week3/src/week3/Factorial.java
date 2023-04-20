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
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double  result=1; // chose double data type because there very larg numbers in factorial
        for (int i = number; i >1 ; i--) {
            result*=i;
        }
        System.out.println("factorial is : "+ result);
    }
}
