import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//Todo:Напишите программу, которая запрашивает у пользователя ввод даты в формате "год-месяц-день" (например, "2022-01-31").
// Затем попробуйте преобразовать эту строку в объект типа LocalDate с помощью метода LocalDate.parse().
// Обработайте возможное исключение DateTimeParseException, если введенная строка имеет неверный формат.

public class DateParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;
        boolean validDate = false;

        while (!validDate) {
            try {
                System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
                String input = scanner.nextLine();

                date = LocalDate.parse(input);
                validDate = true;

            } catch (DateTimeParseException e) {
                System.out.println("Ошибка! Неверный формат даты.");
                System.out.println("Пример правильного формата: 2023-12-31");
            }
        }

        System.out.println("Успешно распознанная дата: " + date);
        scanner.close();
    }
}