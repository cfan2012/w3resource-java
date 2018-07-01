import java.util.Scanner;

public class Main {

  public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
    for(int i = 1 ;i < 1000; i++){
      int x = i / 100;
      int y = (i % 100) / 10;
      int z = i % 10;
      int sum = x*x*x + y*y*y +z*z*z;
      if(i == sum || i < 10)
        System.out.println(i);
    }
  }
}


