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
public class AreaOfACircle {
     public static void main(String[] args) {
    double PI = 3.14159;
    Scanner input = new Scanner(System.in);

    double radius = input.nextDouble();

    double area = PI * radius * radius;

    System.out.printf("A=%.4f\n", area);

  }
}
