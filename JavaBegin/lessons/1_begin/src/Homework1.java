
// import java.util.ArrayList;
//import java.util.Arrays;
// import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 1.Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2.Вывести все простые числа от 1 до 100
// 3.Реализовать простой калькулятор
// 4.*Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
//    например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
//    Предложить хотя бы одно решение или сообщить, что его нет.

public class Homework1 {
  // 1
  static int nTriangle(int n) {
    int res = 1;
    for (int i = 2; i <= n; i++) {
      res += i;
    }
    return res;
  }

  static int nFact(int n) {
    int res = 1;
    for (int i = 2; i <= n; i++) {
      res *= i;
    }
    return res;
  }

  // 2
  // static List<Integer> getSimple(int max) {
  // List<Integer> res = new ArrayList<>();
  // if (max > 0)
  // res.add(2);
  // for (int i = 3; i <= max; i += 2) {
  // if (isSimple(i, res)) {
  // res.add(i);
  // }
  // }
  // return res;
  // }

  static boolean isSimple(int n, List<Integer> res) {
    for (int i = 0; i < res.size(); i++) {
      var simple = res.get(i);
      if (simple * simple > n) {
        return true;
      }
      if (n % simple == 0) {
        return false;
      }
    }
    return true;
  }

  // 3

  static double calc() {
    double res = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
    int a = scanner.nextInt();
    System.out.println("Введите оператор");
    String op = scanner.next();
    System.out.println("Введите второе число");
    int b = scanner.nextInt();
    switch (op) {
      case "+":
        res = a + b;
        break;
      case "-":
        res = a - b;
        break;
      case "*":
        res = a * b;
        break;
      case "/":
        if (b != 0) {
          res = a * 1.0 / b;
          break;
        } else {
          System.out.println("На ноль делить нельзя!");
          break;
        }
    }
    scanner.close();
    return res;
  }

  // 4

  static void checkExpression(String str) {
    // складываем слагаемые и результат в массив
    String[] terms = str.split("\\s+(\\+|\\=)\\s+");
    // с помощью функции getDigit преобразуем массив строк в массив чисел
    int[] digits = new int[3];
    for (int i = 0; i < digits.length; i++) {
      digits[i] = (getDigit(terms[i]));
    }
    // находим разницу между результатом и суммой слагаемых
    int diff = digits[2] - (digits[0] + digits[1]);
    if (diff < 0) {
      System.out.println("Решения нет");
    } else {
      // находим недостающие десятки и единицы
      int unit = diff % 10;
      int decimal = diff - unit;
      System.out.printf("Как-то так: %d + %d = %d \n", unit + digits[0], decimal + digits[1], digits[2]);
    }

  }

  // функция вместо знака "?" подставляет "0"
  static int getDigit(String str) {
    str = str.replaceAll("\\?", "0");
    int i = 0;
    try {
      // преобразуем в число
      i = Integer.parseInt(str.trim());
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatExeption: " + nfe.getMessage());
    }
    return i;
  }

  public static void main(String[] args) {
    // 1
    // System.out.println(nTriangle(12)); // 78
    // System.out.println(nFact(5)); // 120

    // 2
    // getSimple(100).forEach(System.out::println);
    // System.out.println(Arrays.toString(getSimple(100).toArray())); // [2, 3, 5,
    // 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
    // 83, 89, 97]

    // 3

    // System.out.printf("%.02f", calc());

    // 4
    // checkExpression("2? + ?4 = 69");
  }
}
