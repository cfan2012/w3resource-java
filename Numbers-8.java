import java.util.Scanner;

public class Main {

  public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
    int[] a = new int[123];
    a[1] = 1;
    for(int i = 1; i <= 10; i++) {
      for(int j = i; j > 1; j--)
        a[j] = a[j] + a[j - 1];
      a[i + 1] = a[i];
      for (int j = i + 1; j > 1; j--)
        a[j] = a[j] + a[j - 1];
      System.out.println(a[i + 1]-a[i]);
    }
  }
}
