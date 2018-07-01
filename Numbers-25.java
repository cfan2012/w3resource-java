import java.util.Scanner;

public class Main {

  public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
    System.out.println("First 20 Pell numbers: ");
    int x = 1;
    int y = 0;
    int z;
    for(int i = 0; i < 20; i++){
      z = x + y * 2;
      System.out.print(z+" ");
      x = y;
      y = z;
    }
  }
}


