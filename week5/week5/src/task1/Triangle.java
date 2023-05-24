
package task1;

import java.util.Date;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String colorName , boolean isFilles ) {
        super(colorName, isFilles);
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String colorName , boolean isFilles , double side1, double side2, double side3) {
        super(colorName, isFilles);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerrimeter(){
    return side1 + side2 + side3;
    } 
    public double getArea() {
        double halfOfPerrimeter = getPerrimeter() / 2;
        return Math.sqrt(halfOfPerrimeter * (halfOfPerrimeter - side1) * (halfOfPerrimeter - side2) * (halfOfPerrimeter - side3));

    }
     public String toString() {
        return "Triangle: side1 " + side1 + ", side2 =  " + side2 + ",  side3 =  " + side3;
    }
}