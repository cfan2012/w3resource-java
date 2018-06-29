import java.util.Scanner;

public class Main {
  public static void main(String args[]){
	System.out.print("Input a value for inch: ");
    Scanner scanner = new Scanner(System.in);
    double i = scanner.nextDouble();
    double m = i *0.0254;
    System.out.println(i + " inch is " + m + " meters");  
  }
}
