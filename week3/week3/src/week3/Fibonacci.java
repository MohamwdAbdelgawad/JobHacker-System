/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Scanner;

public class Fibonacci {
       public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     // 0 1 1 2 3 5 8 13 
        int number = input.nextInt();
        int Fibonacci0 =0;
        int Fibonacci1 =1;
        if (number==0) 
                   System.out.print(Fibonacci0);
        else if(number==1) 
                    System.out.print(Fibonacci1);
        else{
                    System.out.print(Fibonacci0+" ");
                    System.out.print(Fibonacci1 + " ");
                   for(int i  = 2 ; i <= number ; i++){
                            System.out.print(Fibonacci0+Fibonacci1+" ");
                            int temp= Fibonacci1;
                            Fibonacci1=Fibonacci0+temp;
                            Fibonacci0=temp;
            }
        }

}

}
        
    

