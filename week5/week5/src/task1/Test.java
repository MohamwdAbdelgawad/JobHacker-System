/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Eng Mohamed
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Triangle sides ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter Triangle Color ");
        String color = input.next();
        System.out.println("is the Triangle Filled? true or false  ");
        boolean a = input.nextBoolean();
        
        Triangle triangle1 = new Triangle(color, a, side1, side2, side3);
        
        System.out.println("area = " + triangle1.getArea() +"\n"
                + "Perrimeter = "+ triangle1.getPerrimeter() + "\n" +
                        "Color : "+ triangle1.getColorName()+"\n"
                + "IsFilled : "+ triangle1.isFilled());


    }
}
