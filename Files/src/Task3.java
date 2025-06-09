import java.io.*;
import java.util.Scanner;

/*
Todo:   1.  Пользователь вводит с клавиатуры пути к четырем файлам.
        2.	Программа открывает каждый из четырех файлов и считывает их содержимое.
        3.	Программа записывает содержимое трех файлов в четвертый файл.
        4.	Программа подсчитывает количество перенесенных байт.
        5.	Программа выводит на экран отчет о количестве перенесенных байт.

 */

public class Task3 {

    public static boolean validateFile(File file, String errorMessage) {
        if (!file.exists() || !file.isFile()) {
            System.out.println(errorMessage);
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к первому файлу: ");
        String filePathFirst = scanner.nextLine();

        System.out.println("Введите путь к второму файлу: ");
        String filePathTwo = scanner.nextLine();

        System.out.println("Введите путь к третьему файлу: ");
        String filePathThree = scanner.nextLine();

        System.out.println("Ведите путь к четвертому файлу: ");
        String filePathFour = scanner.nextLine();

        File fileFirst = new File(filePathFirst);
        File fileTwo = new File(filePathTwo);
        File fileThree = new File(filePathThree);
        File fileFour = new File(filePathFour);

        if (!validateFile(fileFirst, "Ошибка: первый файл не существует!")) return;
        if (!validateFile(fileTwo, "Ошибка: второй файл не существует!")) return;
        if (!validateFile(fileThree, "Ошибка: третий файл не существует!")) return;
        if (!validateFile(fileFour, "Ошибка: четвертый файл не существует!")) return;


    }
}
