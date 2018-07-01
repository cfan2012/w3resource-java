import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    System.out.print("First Twenty Hamming numbers: ");
    int sum = 0;
    for(int i = 1 ;i <= 999999; i++){
      if(isHamming(i)){
            System.out.print(i+" ");
            sum++;
            if(sum >=20)
              break;
          }
    }
  }

  public static boolean isHamming(int num) {
    if (num == 1)
      return true;
    if (num % 2 == 0)
      return isHamming(num / 2);
    if (num % 3 == 0)
      return isHamming(num / 3);
    if (num % 5 == 0)
      return isHamming(num / 5);
    return false;
  }
}
  
  
  



