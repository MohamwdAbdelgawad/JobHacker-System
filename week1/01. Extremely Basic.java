import java.util.Scanner;

public class Main {
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