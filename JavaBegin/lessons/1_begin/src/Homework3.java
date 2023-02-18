import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
//        1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//        2 Пусть дан произвольный список целых чисел, удалить из него четные числа
//        3* Реализовать алгоритм сортировки слиянием
//        Формат сдачи: файл с расширением java или ссылка на гит

        // 1--------------------------------------------------------------
/*
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
*/
        // 2--------------------------------------------------------------
/*
        ArrayList<Integer> arrInt_2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер листа");
        int arrLength_2 = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < arrLength_2; i++) {
            arrInt_2.add(generateRandomIntIntRange(0,20));
        }
        System.out.println(arrInt_2);
        Iterator<Integer> iterator = arrInt_2.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%2==0){
                iterator.remove();
            }
        }
        System.out.println(arrInt_2);

*/
        // 3--------------------------------------------------------------
/*
        ArrayList<Integer> arrInt_3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер листа");
        int arrLength = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < arrLength; i++) {
            arrInt_3.add(generateRandomIntIntRange(0,50));
        }
        System.out.println(arrInt_3);
        System.out.println(mergeSort(arrInt_3));
*/
    }
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> aL){
        if(aL.size()<2) return aL;

        int middle = aL.size()/2;
        ArrayList<Integer> leftList=new ArrayList<>();
        ArrayList<Integer> rightList=new ArrayList<>();

        for (int i = 0; i < middle; i++) {
            leftList.add(aL.get(i));
        }
        for (int i = middle; i < aL.size(); i++) {
            rightList.add(aL.get(i));
        }
        mergeSort(leftList);
        mergeSort(rightList);
        merge(aL,leftList,rightList,leftList.size(),rightList.size());
        return aL;
    }

    public static void merge(ArrayList<Integer> aL,
                                           ArrayList<Integer> leftArr,
                                           ArrayList<Integer> rightArr,
                                           int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<left && j < right){
            if(leftArr.get(i) <= rightArr.get(j)){
                aL.set(k++,leftArr.get(i++)); // ?!
            }
            else {
                aL.set(k++,rightArr.get(j++));
            }
        }
        while (i<left){
            aL.set(k++,leftArr.get(i++));
        }
        while (j<right){
            aL.set(k++,rightArr.get(j++));
        }

    }


}
