import java.io.*;
import java.util.Scanner;

/*
Todo: 1.	Пользователь с клавиатуры вводит путь к файлу, искомое слово и слово для замены.
        2.	Программа открывает файл и ищет искомое слово в его содержимом.
        3.	Если слово найдено, программа заменяет его на указанное слово.
        4.	Программа подсчитывает количество произведенных замен.
        5.	Программа выводит на экран отчет о количестве замен.

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введиет путь к файлу: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Ошибка: файл не существует!");
            return;
        }
    }
}
