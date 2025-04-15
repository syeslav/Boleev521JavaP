import java.util.Arrays;
import java.util.Objects;

public class Generics {

    // Задача 1: Сравнение массивов
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) return false;
        if (array1.length != array2.length) return false;

        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    // Задача 2: Слияние массивов
    public static <T> T[] mergeArrays(T[] array1, T[] array2) {
        T[] mergedArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }

    // Задача 3: Поиск элемента
    public static <T> int findElement(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], element)) {
                return i;
            }
        }
        return -1;
    }


    // Примеры использования
    public static void main(String[] args) {
        // Задача 1
        Integer[] arr1 = {null};
        Integer[] arr2 = {null};
        System.out.println("Сравнение массивов: " + compareArrays(arr1, arr2)); // true

        // Задача 2
        String[] arr3 = {"Hello", "World"};
        String[] arr4 = {"Java", "!"};
        String[] merged = mergeArrays(arr3, arr4);
        System.out.println("Слияние массивов: " + Arrays.toString(merged)); // [Hello, World, Java, !]

        // Задача 3
        Double[] arr5 = {1.5, 2.7, 3.0};
        System.out.println("Поиск элемента: " + findElement(arr5, 3.0)); // 2

    }
}