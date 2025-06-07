import java.io.*;
import java.util.Scanner;

/*
Todo:   1.  Пользователь вводит с клавиатуры путь к файлу.
        2.	Программа считывает содержимое файла.
        3.	Программа анализирует содержимое файла и подсчитывает количество букв, чисел и знаков препинания.
        4.	Программа выводит на экран количество букв, чисел и знаков препинания в файле.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        // Провкерка существования файла
        if (!file.exists() || !file.isFile()) {
            System.out.println("Ошибка: файл не существует!");
            return;
        }

        try (FileReader reader = new FileReader(file)) {
            int letterCount = 0;
            int digitCount = 0;
            int punctuationCount = 0;
            int c;

            while ((c = reader.read()) != -1) {
                char character = (char) c;

                if (Character.isLetter(character)) {
                    letterCount++;
                } else if (Character.isDigit(character)) {
                    digitCount++;
                }
                System.out.println("Результаты анализа файла:");
                System.out.println("Буквы: " + letterCount);
                System.out.println("Цифры: " + digitCount);
            }
        }catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
