import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input six non-negative digits: ");
    String s = scanner.nextLine();
    for(int i =0; i < 5; i++)
      System.out.print(s.charAt(i)+" ");
    System.out.println(s.charAt(5)+" ");
  }
}
