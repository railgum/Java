package JavaException_lesson1;

public class App {
    /* Задание 0

     * Реализуйте метод, принимающий в качестве аргумента
     * целочисленный массив. Если длина массива меньше некоторого
     * заданного минимума, метод возвращает -1 в качестве кода ошибки,
     * иначе - длину массива.
     */
    /* -----------------------------------------
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        int size1 = checkArraySize(arr);
        System.out.println(size1);

        int[] arr2 = new int[] {1,2};
        int size2 = checkArraySize(arr2);
        if (size2 == -1) {
            err.println("Array size is less than min");
        }

    }
    public static int checkArraySize(int[] array) {
        if (array.length < 3) {
            return -1;
        }

        return array.length;
    }
    ---------------------------------
     */

    /* Задание 1
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив
     * и некоторое значение. Метод ищет в массиве заданное значение и возвращает
     *  его индекс. При этом, например:
     *   - если длина массива меньше некоторого заданного минимума, метод возвращает -1,
     *     в качестве кода ошибки.
     *   - если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
     *   - если вместо массива пришел null, метод вернет -3
     *   - придумайте свои варианты исключительных ситуаций и верните соответствующие
     *     коды ошибок.
     *  Напишите метод, в котором реализуйте взаимодействие с пользователем.
     *  То есть, этот метод запросит искомое число у пользователя, вызовет первый,
     *  обработает возвращенное значение и покажет читаемый результат пользователю.
     *  Например, если вернулся -2, пользователю выведется сообщение: “Искомый
     *  элемент не найден”.
     * -----------------------------------------
     */

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = null;
        int[] arr3 = new int[]{3};

        int index1 = getIndexByElem(arr1, 2);
        askUser(index1);

        int index2 = getIndexByElem(arr2, 2);
        askUser(index2);

        int index3 = getIndexByElem(arr3, 2);
        askUser(index3);

        int index4 = getIndexByElem(arr1, 5);
        askUser(index4);
    }
    public static int getIndexByElem(int[] array, int elem) {
        if (array == null) {
            return  -3;
        }
        if (array.length < 3) {
            return  -1;
        }
        for (int i =0; i < array.length; i++) {
            if (array[i] == elem) {
                return  i;
            }
        }
        return - 2;
    }
    public static void askUser(int index) {
        if (index == -1) {
            System.err.println("Array size less than minimum");
        } else if (index == -3) {
            System.err.println("Array is null");
        } else if (index == -2) {
            System.err.println("Element is not found");
        } else {
            System.out.println("Index of element is " + index);
        }
    }


    /*
     * Задание 2
     * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     * Необходимо посчитать и вернуть сумму элементов этого массива.
     * При этом накладываем на метод 2 ограничения: метод может работать только
     * с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке
     * может лежать только значение 0 или 1.
     * Если нарушается одно из условий, метод должен бросить RuntimeException
     * с сообщением об ошибке.
     */
    /*-----------------------------------------
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,1,0,1},
                {0,1,1},
                {0,1,0}
        };

        int sum = sumOfMatrix(matrix);
        System.out.println(sum);

    }
    public static int sumOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowNumber = matrix.length;
            int columnNumber = matrix[i].length;
            if (rowNumber != columnNumber) {
                throw new RuntimeException("Number of rows is not equal to number of column");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] != 1) {
                    throw new RuntimeException("Element is not 0 or 1");
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    */
}
