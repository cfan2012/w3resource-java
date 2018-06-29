import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    System.out.print("Input a degree in Fahrenheit: ");
	Scanner scanner = new Scanner(System.in);
    double f = scanner.nextDouble();
    double c = (5 * ( f - 32 )) / 9.0;
    System.out.println( f +  " degree Fahrenheit is equal to " + c + " in Celsius" );
  }
}
