import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextInt();
    double b = Math.pow(a,1/3.0);
    System.out.println(b);
    if(a==b*b*b)
      System.out.println("yes");
    else System.out.println("no");
    
  }
}
