import java.io.IOException;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double PI = 3.14159;
    Scanner input = new Scanner(System.in);

    double radius = input.nextDouble();

    double area = PI * radius * radius;

    System.out.printf("A=%.4f\n", area);

  }

}