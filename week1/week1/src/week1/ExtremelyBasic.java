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
public class ExtremelyBasic {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int number1, number2;

    number1 = input.nextInt();
    input.nextLine();

    number2 = input.nextInt();
    input.nextLine();

    int sum = number1 + number2;
    System.out.println("X = " + sum);
  }
}
