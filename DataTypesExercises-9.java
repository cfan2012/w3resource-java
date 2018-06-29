import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input 1st integer: ");
    Integer a = scanner.nextInt();
    System.out.print("Input 2st integer: ");
    Integer b = scanner.nextInt();
    System.out.println("Sum of two integers: "+ (a + b));
    System.out.println("Difference of two integers: "+ (a - b));
    System.out.println("Product of two integers: "+ (a * b));
    System.out.printf("Average of two integers: %.2f\n", (a + b)*1.0/2 );
    System.out.println("Max integer: "+ Math.max(a,b));
    System.out.println("Min integer: "+ Math.min(a,b));
    
    
    
  }
}
