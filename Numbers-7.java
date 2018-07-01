import java.util.Scanner;

public class Main {

  public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i<= 10; i++)
      System.out.println(getLucasNumber(i));
    


  }
  public static int getLucasNumber(int num) {
    if (num == 0) return 2;
    if (num == 1) return 1;
    return getLucasNumber(num - 1) + getLucasNumber(num - 2);
  }
}
