import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    String s = String.valueOf(x);
    if(s.indexOf("0")<0)
      System.out.println("no");
    else System.out.println("yes");
  }


}
