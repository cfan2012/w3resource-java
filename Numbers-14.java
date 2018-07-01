import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int x2 = x * x;
    String s = String.valueOf(x);
    String s2 = String.valueOf(x2);
    if(s2.endsWith(s))
      System.out.println("yes");
    else System.out.println("no");
  }


}
