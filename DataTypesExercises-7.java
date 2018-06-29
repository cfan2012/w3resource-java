import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input distance in meters: ");
    float distance = scanner.nextFloat();
    System.out.print("Input hour: ");
    float h = scanner.nextFloat();
    System.out.print("Input minutes: ");
    float m = scanner.nextFloat();
    System.out.print("Input seconds: ");
    float s = scanner.nextFloat();
    float sum = h * 3600 + m * 60 + s;
    float ms = distance / sum;
    float kh = (distance / 1000) / (sum / 3600);
    float mh = kh / (float)1.609;
    System.out.println("Your speed in meters/second is "+ ms);
    System.out.println("Your speed in km/h is "+ kh);
    System.out.println("Your speed in miles/h is "+ mh);
   
  }
}
