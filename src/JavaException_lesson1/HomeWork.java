package JavaException_lesson1;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
//        float[] arr1 = {65,565,5,44,65};
//        int[] arr2 = {45,78,2,44,56};
//        float[] rezult = dividingArray(arr1,arr2);
//        String rezOfRez = Arrays.toString(rezult);
//        System.out.println(rezOfRez);
    }
    /* 1 Задание*/
    // 1)
        public static void f1() {
        File f = new File("X://java/file.txt");
            //FileReader fr = new FileReader(f);
        }
    //2)
        public static void f2() {
        System.out.println("Чтобы понять рекурсию, нужно понять рекурсию!");
            f2();
        }
    //3
        public static void f3() {
            int[] arr = null;
            int a = arr.length;
            System.out.println(a);
        }
    /* 2 задание */
    public static int sum2d(String[][] arr) {  // я не джавист, м.б. должно вернуть число, а в аргументах массив строк?
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  // массив может быть null
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]); // может быть NullPointer
                sum += val;
            }
        }
        return sum;
    }

    /* 3 задание */
    public static int[] differenceArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays have different size");
        }

        int[] rezult = new int[arr1.length];
        for (int i = 0; i < rezult.length; i++) {
            rezult[i] = arr1[i] - arr2[i];
        }
        return rezult;
    }

    /* 4 задание */

    public static float[] dividingArray(float[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays have different size");
        }

        float[] rezult = new float[arr1.length];
        for (int i = 0; i < rezult.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("One of the array values is zero");
            }
            rezult[i] = arr1[i] / arr2[i];
        }
        return rezult;
    }

}
