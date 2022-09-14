package JavaException_lesson1;

import java.io.File;
import java.io.FileReader;


public class HomeWork {
    public static void main(String[] args) {
        sum2d();
    }
    /* 1 Задание*/
    // 1)
        public static void f1() {
        File f = new File("X://java/file.txt");
            FileReader fr = new FileReader(f);
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
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }


}
