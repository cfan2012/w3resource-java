import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if(hash(x))
      System.out.println("yes");
    else  System.out.println("no");
  }

  public static boolean hash(int x){
    for(int i = 0; i < x; i++)
      if(i * (i + 1) == x){
        return true;
      }
      return false;
  }

}
