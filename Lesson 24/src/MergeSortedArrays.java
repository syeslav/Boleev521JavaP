public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};
        int[] arr3 = mergeArrays(arr, arr2);

        // Вывод результата для проверки
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Объединяем элементы, пока не достигнем конца одного из массивов
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Добавляем оставшиеся элементы из первого массива
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Добавляем оставшиеся элементы из второго массива
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}