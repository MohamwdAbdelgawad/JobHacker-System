
package week2;
import java.util.Scanner;
public class evenOrOdd {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       if(isEven(number)) 
           System.out.println("the number is even");
       else 
           System.out.println("the number is odd");

           
    }
     public static boolean isEven(int number)
     {
     if(number%2 == 0) return true;
     else return false;
     }
    
}
