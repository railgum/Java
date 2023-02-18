import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Homework3 {
    public static void main(String[] args) {
//        1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//        2 Пусть дан произвольный список целых чисел, удалить из него четные числа
//        3* Реализовать алгоритм сортировки слиянием
//        Формат сдачи: файл с расширением java или ссылка на гит

        // 1

        ArrayList<Integer> arrInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер листа");
        int arrLength = scanner.nextInt();
//        System.out.println("Введите min значение случайных чисел");
//        int min = scanner.nextInt();
//        System.out.println("Введите max значение случайных чисел");
//        int max = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < arrLength; i++) {
//            arrInt.add(generateRandomIntIntRange(min,max));
            arrInt.add(generateRandomIntIntRange(0,100));
        }

        // 1 вариант
        System.out.println(arrInt);
        System.out.println("Min - " + Collections.min(arrInt));
        System.out.println("Max - " + Collections.max(arrInt));
        double sum = arrInt.stream().mapToDouble(a->a).sum();
        System.out.println("Average - " + sum/arrLength);

        // 2 вариант
        int minValue = arrInt.get(0);
        int maxValue = arrInt.get(0);
        double average = 0;
        for (Integer i: arrInt) {
            if(i<minValue) minValue = i;
            if(i>maxValue) maxValue=i;
            average+=i;
        }
        System.out.println("Min - " + minValue);
        System.out.println("Max - " + maxValue);
        System.out.println("Average - " + average/arrLength);

    }
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
