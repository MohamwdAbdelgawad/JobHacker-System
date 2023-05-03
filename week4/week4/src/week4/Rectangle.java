/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

public class Rectangle {
    private double width ;
    private double height ;

    public Rectangle() {
        width=1; 
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
    return width*height;
    }
    
    public double getPerimeter(){
    return (width + height) * 2;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
                 
          return         "width = " + this.getWidth() 
                           + " , height  = " + this.getWidth()  
                           + " ,  area =  " + this.getArea()
                           + " , Perimeter = " + this.getPerimeter();
                
             
    }
    
    
}
