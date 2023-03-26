package JavaException_lesson2;

//import java.io.FileNotFoundException;
//import java.util.InputMismatchException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork2 {
  
  public static void main(final String[] args) {
  giveMeFloat();
  f1();
  }
  
   // 1 задание
   public static void giveMeFloat() {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Введите дробное число");
   float number;
   boolean isFloat = false;
   while (!isFloat) {
   try {
   if (!scanner.hasNextInt()) {
   number = scanner.nextFloat();
   System.out.println("Ваше число " + number);
   isFloat = true;
   } else {
   isFloat = false;
   System.out.println("Введите число с дробной частью через ЗАПЯТУЮ");
   String line = scanner.nextLine();
   }
   } catch (InputMismatchException e) {
   System.err.println("Это не число. Попробуйте ещё раз");
   isFloat = false;
   String line = scanner.nextLine();
   }
   }
   }
   

  // 2 задание
  /
   
   public static void f1() {
   
   try
  
   {
   int d = 0;
   int[] intArray = new int[8];
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
   } catch (NullPointerException ex) {
   System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
   System.out.println("Массив выходит за пределы своего размера!");
   } catch (Throwable ex) {
   System.out.println("Что-то пошло не так...");
   }
   }
   
   public static void printSum(Integer a, Integer b) throws IOException {
   FileReader test = null;
   try {
   test = new FileReader("test");
  test.read();
   System.out.println(a + b);
   } catch (IOException e) {
   System.err.println("Файл не найден");
   } finally {
   if (test != null) {
   test.close();
   }
   }
   

  // 4 задание
  /*
   * 
   * Разработайте программу, которая
   * выбросит Exception, когда пользователь
   * вводит пустую
   * строку. Пользователю должно
   * показаться сообщение,*
   * что пустые
   * строки вводить нельзя.
   */
  // Определение своего исключения
  public class EmptyString extends Exception { 
    public EmptyString(String message) {
      super(message);
    }
  // Запуск программы
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String line = scan.nextLine();
      checkNonEmptyString(line);
    }
  // Метод для проверки строки
    public static void checkNonEmptyString(String str) throws EmptyString {
      if (str == null || str.isEmpty() || str.trim().isEmpty()) {
        throw new EmptyString("Нельзя вводить пустые строки!");
      }
    }
  }

}
