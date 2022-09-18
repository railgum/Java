package JavaException_lesson2;

import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork2 {
  public static void main(String[] args) {
    // giveMeFloat();
    f1();
  }

  // 1 задание
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

  // 2 задание
  public static void f1() {

    try

    {
      int d = 0;
      int[] intArray = new Int[8];
      for (int i : intArray) {
        double catchedRes1 = i / d;
        System.out.println("catchedRes1 = " + catchedRes1);
      }
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }
  }

  // 3 задание

  public static void main(String[] args) throws Exception {
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = { 1, 2 };
      abc[3] = 9;
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    }
  }

  public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
  }
  // 4 задание
  /*
   * Разработайте программу, которая выбросит Exception, когда пользователь
   * вводит пустую строку. Пользователю должно показаться сообщение,
   * что пустые строки вводить нельзя.
   */
}
