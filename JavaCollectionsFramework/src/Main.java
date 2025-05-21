import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер стека: ");
        int size = scanner.nextInt();
        FixedIntStack stack = new FixedIntStack(size);

        while (true) {
            System.out.println("\n=== Меню управления стеком ===");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Извлечь элемент");
            System.out.println("3. Текущий размер");
            System.out.println("4. Проверить пустоту");
            System.out.println("5. Проверить заполненность");
            System.out.println("6. Очистить стек");
            System.out.println("7. Просмотреть верхний элемент");
            System.out.println("8. Выход");
            System.out.print("Выберите операцию: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Введите число: ");
                        int num = scanner.nextInt();
                        stack.push(num);
                    }
                    case 2 -> {
                        int val = stack.pop();
                        if (val != -1) System.out.println("Извлечено: " + val);
                    }
                    case 3 -> System.out.println("Элементов в стеке: " + stack.size());
                    case 4 -> System.out.println("Пуст: " + stack.isEmpty());
                    case 5 -> System.out.println("Полон: " + stack.isFull());
                    case 6 -> {
                        stack.clear();
                        System.out.println("Стек очищен");
                    }
                    case 7 -> {
                        int top = stack.peek();
                        if (top != -1) System.out.println("Верхний элемент: " + top);
                    }
                    case 8 -> {
                        System.out.println("Работа завершена");
                        scanner.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Неверный выбор!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Введите число от 1 до 8");
                scanner.nextLine();
            }
        }
    }
}