import java.util.InputMismatchException;
import java.util.Scanner;

//Todo:Напишите программу, которая запрашивает у пользователя ввод данных и пытается обработать этот ввод.
// Обработайте исключение InputMismatchException, которое возникает, если введенные данные не соответствуют ожидаемому формату.
public class InputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Пожалуйста, введите целое число: ");
                userInput = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Вы ввели данные неверного формата!");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }

        System.out.println("Спасибо! Вы ввели: " + userInput);
        scanner.close();
    }
}
