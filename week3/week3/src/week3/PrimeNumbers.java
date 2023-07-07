
package week3;
import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isPrime(number)) System.out.println("number is prime");
        else System.out.println("number is not prime");
    }
public static boolean isPrime(int number)
{
    // 0,1 and all even numbers is not prime because it's divisable by 2  except number 2
            if (number == 2){
               return true;
            }
        else if (number < 2 || number % 2 == 0){ 
            return false;
        }else {
           // use i * i <=number  instead of  square root of number to best efficient code
            for (int i = 3; i * i <= number; i+= 2) {
                if (number % i == 0) {
                    return false;
                }
            }
               return true;
        }
    
    }

}        

