import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> stringNumbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        String result = stringNumbers.stream()
                .map(Integer::parseInt)                         // Преобразование строк в целые числа
                .filter(number -> number % 2 == 0)      // Фильтрация четных чисел
                .map(String::valueOf)                           // Преобразование чисел обратно в строки
                .collect(Collectors.joining(", "));     // Сборка в строку, разделенную запятыми

        System.out.println("Результат: " + result);
    }
}