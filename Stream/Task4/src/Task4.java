/*Todo: 	Сортировка и поиск:
o	Создайте список целых чисел.
o	Отсортируйте его по убыванию.
o	Найдите первые 3 элемента после сортировки.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        // Создаем список целых чисел
        List<Integer> numbers = Arrays.asList(5, 9, 1, 14, 7, 3, 11, 8, 2, 6);

        // Отображаем исходный список
        System.out.println("Исходный список: " + numbers);

        // Сортируем список по убыванию и находим первые 3 элемента
        List<Integer> top3 = numbers.stream()
                .sorted(Comparator.reverseOrder())          // Сортировка по убыванию
                .limit(3)                           // Ограничение результата тремя элементами
                .collect(Collectors.toList());              // Сбор результата в список

        // Выводим отсортированный по убыванию список
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Отсортированный по убыванию список: " + sortedDesc);

        // Выводим первые 3 элемента
        System.out.println("Первые 3 элемента после сортировки по убыванию: " + top3);

        // Альтернативный способ с промежуточным выводом
        System.out.println("\nПошаговое выполнение:");
        System.out.print("Первые 3 наибольших числа: ");
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(n -> System.out.print(n + " "));
    }
}