/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author Eng Mohamed
 */
public class Average2 {
     public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double a , b ,c , average ;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        average = (a *2 + b*3 +c*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n",average);

}
}
