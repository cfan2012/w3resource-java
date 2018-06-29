import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input weight in pounds: ");
    double w = scanner.nextDouble();
    System.out.print("Input height in inches: ");
    double h = scanner.nextDouble();
    double b = w * 0.45359237 / (h * 0.0254 * h * 0.0254);
    System.out.println("Body Mass Index is " + b);
  }
}
