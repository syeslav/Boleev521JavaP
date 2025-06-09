import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Todo:   1.	Пользователь с клавиатуры вводит путь к файлу, искомое слово и слово для замены.
        2.	Программа открывает файл и ищет искомое слово в его содержимом.
        3.	Если слово найдено, программа заменяет его на указанное слово.
        4.	Программа подсчитывает количество произведенных замен.
        5.	Программа выводит на экран отчет о количестве замен.

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных от пользователя
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        System.out.print("Введите искомое слово: ");
        String searchWord = scanner.nextLine();

        System.out.print("Введите слово для замены: ");
        String replaceWord = scanner.nextLine();

        // Проверка ввода
        if (searchWord.isEmpty() || replaceWord.isEmpty()) {
            System.out.println("Ошибка: слова не могут быть пустыми!");
            return;
        }

        try {
            // Чтение содержимого файла
            String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

            // Подсчет и замена слов с учетом границ слов
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(searchWord) + "\\b");
            Matcher matcher = pattern.matcher(content);
            StringBuffer result = new StringBuffer();
            int count = 0;

            while (matcher.find()) {
                count++;
                matcher.appendReplacement(result, Matcher.quoteReplacement(replaceWord));
            }
            matcher.appendTail(result);

            // Запись изменений обратно в файл
            if (count > 0) {
                Files.write(Paths.get(filePath), result.toString().getBytes(StandardCharsets.UTF_8));
            }

            // Вывод отчета
            System.out.println("Произведено замен: " + count);

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
