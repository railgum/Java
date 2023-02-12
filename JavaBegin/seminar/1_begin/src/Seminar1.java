
//import java.time.LocalTime;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.random.RandomGenerator;
//import java.lang.reflect.Array;
//import java.time.LocalDateTime;

public class Seminar1 {

  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    // System.out.println(LocalDateTime.now());
    // Scanner scan = new Scanner(System.in);
    // System.out.print("Введите ваше имя: ");
    // String userName = scan.next();
    //// System.out.println("Привет, " + userName);
    // int hour = LocalTime.now().getHour();
    // if (hour >= 5 && hour < 12) {
    // System.out.print("Доброе утро! ");
    // } else if (hour >= 12 && hour < 18) {
    // System.out.print("Добрый день! ");
    // } else if (hour >= 18 && hour < 23) {
    // System.out.print("Добрый вечер! ");
    // } else {
    // System.out.print("Доброй ночи! ");
    // }
    // System.out.print(userName);
    // scan.close();

    // Random r = new Random();
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Введите длину массива");
    // int arrLength = scanner.nextInt();
    // int[] arr = new int[arrLength];
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = r.nextInt(2);
    // System.out.print(arr[i] + " ");
    // }
    // int count = 0;
    // int max = 0;
    // for (int i : arr) {
    // if (i == 1) {
    // count++;
    // if (count > max) {
    // max = count;
    // }
    // } else {
    // count = 0;
    // }
    // }
    // scanner.close();
    // System.out.printf("\n Максимальное количество идущих подряд единиц: %d",
    // max);

    String[] strings = { "котик", "кошка", "кот", "корова" };
    for (String word : strings) {
      // find min word.length
      System.out.println(word);
    }
    for (String word : strings) {
      if (!word.contains(word)) {

      }
    }

  }
}
