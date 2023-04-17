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
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double x1, x2, y1, y2, distance;
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.printf("%.4f\n", distance);
  }
}
