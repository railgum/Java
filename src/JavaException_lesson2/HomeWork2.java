package JavaException_lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork2 {
  public static void main(String[] args) {
    givMeFloat();
  }

  public static float givMeFloat() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Введите дробное число");

     if (scanner.hasNextFloat()) {
      float number = scanner.nextFloat();
      return number;
     } else {
      System.out.println("Извините, это не дробное число. Попробуйте ещё раз");
     }
    
  }
}
