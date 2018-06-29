import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the side length value: ");
    double v = scanner.nextDouble();
    System.out.printf("Square: %.2f\n", v * v);
    System.out.printf("Cube: %.2f\n", v * v * v);
    System.out.printf("Fourth power: %.2f\n", Math.pow(v, 4));
   
  }
}
