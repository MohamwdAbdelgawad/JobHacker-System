import java.io.IOException;
import java.util.Scanner;

public class Main {
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