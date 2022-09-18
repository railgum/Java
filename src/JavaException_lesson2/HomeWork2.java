package JavaException_lesson2;

import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork2 {
  public static void main(String[] args) {
    giveMeFloat();
  }

  public static float giveMeFloat() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите дробное число");
    float number = 0.0f;
    boolean isFloat = false;
    do {
      try {
        number = scanner.nextFloat();
        if (!scanner.hasNextInt()) {
          System.out.println("Ваше число " + number);
          isFloat = true;
        } else {
          isFloat = false;
          System.out.println("Введите число с дробной частью через ЗАПЯТУЮ");
          // String line = scanner.nextLine();
        }
      } catch (InputMismatchException e) {
        System.err.println("Это не число. Попробуйте ещё раз");
        isFloat = false;
        String line = scanner.nextLine();
      }
    } while (!isFloat);
    return number;
  }

}
