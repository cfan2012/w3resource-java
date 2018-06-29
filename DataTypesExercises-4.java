import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the number of minutes: ");
    int m = scanner.nextInt();
    int day = m / ( 24* 60 );
    int yead = day / 365;
    day %= 365;
    System.out.println(m + " minutes is approximately " + yead + " years and "+day+" days");
    
  }
}
