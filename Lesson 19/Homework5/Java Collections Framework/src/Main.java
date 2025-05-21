import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс FixedIntStack реализует структуру данных "стек" фиксированного размера
 * для хранения целых чисел. Поддерживает основные операции работы со стеком.
 */
class FixedIntStack {
    private final int[] stack;    // Массив для хранения элементов стека
    private int top;              // Индекс верхнего элемента (вершины стека)
    private final int maxSize;    // Максимальная емкость стека

    /**
     * Конструктор создает стек заданного размера
     * @param size - максимальное количество элементов в стеке
     */
    public FixedIntStack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; // Инициализация "пустого" стека
    }

    /**
     * Добавляет элемент в вершину стека
     * @param value - целое число для добавления
     * @throws IllegalStateException если стек полон
     */
    public void push(int value) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Стек переполнен!");
        }
        stack[++top] = value;
    }

    /**
     * Извлекает и возвращает элемент из вершины стека
     * @return извлеченный элемент
     * @throws IllegalStateException если стек пуст
     */
    public int pop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст!");
        }
        return stack[top--];
    }

    /**
     * Возвращает текущее количество элементов в стеке
     */
    public int size() {
        return top + 1;
    }

    /**
     * Проверяет стек на пустоту
     * @return true если стек пуст, false в противном случае
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Проверяет стек на полноту
     * @return true если стек полон, false в противном случае
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * Очищает стек, удаляя все элементы
     */
    public void clear() {
        top = -1;
    }

    /**
     * Возвращает элемент из вершины стека без его извлечения
     * @return элемент на вершине стека
     * @throws IllegalStateException если стек пуст
     */
    public int peek() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("В стеке нет элементов!");
        }
        return stack[top];
    }
}

/**
 * Главный класс приложения с консольным интерфейсом для демонстрации работы стека.
 * Предоставляет пользователю меню для взаимодействия со стеком.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Этап инициализации стека
        int stackSize = 0;
        while (stackSize <= 0) {
            try {
                System.out.print("Введите размер стека: ");
                stackSize = scanner.nextInt();
                if (stackSize <= 0) {
                    System.out.println("Размер должен быть больше нуля!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.nextLine(); // Очистка буфера сканера
            }
        }

        FixedIntStack stack = new FixedIntStack(stackSize);

        // Основной цикл работы с меню
        while (true) {
            System.out.println("\n=== Меню операций ===");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Извлечь элемент");
            System.out.println("3. Показать размер стека");
            System.out.println("4. Проверить на пустоту");
            System.out.println("5. Проверить на полноту");
            System.out.println("6. Очистить стек");
            System.out.println("7. Показать верхний элемент");
            System.out.println("8. Выход из программы");
            System.out.print("Выберите операцию (1-8): ");

            try {
                int choice = scanner.nextInt();

                // Обработка выбора пользователя
                switch (choice) {
                    case 1 -> { // Добавление элемента
                        if (stack.isFull()) {
                            System.out.println("[Ошибка] Стек полон!");
                            break;
                        }
                        System.out.print("Введите целое число: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                        System.out.println("Элемент '" + value + "' успешно добавлен");
                    }
                    case 2 -> // Извлечение элемента
                            System.out.println("Извлеченный элемент: " + stack.pop());
                    case 3 -> // Текущий размер
                            System.out.println("Текущий размер стека: " + stack.size() + "/" + stackSize);
                    case 4 -> // Проверка пустоты
                            System.out.println("Стек пуст: " + (stack.isEmpty() ? "Да" : "Нет"));
                    case 5 -> // Проверка полноты
                            System.out.println("Стек полон: " + (stack.isFull() ? "Да" : "Нет"));
                    case 6 -> { // Очистка стека
                        stack.clear();
                        System.out.println("Стек успешно очищен");
                    }
                    case 7 -> // Просмотр верхнего элемента
                            System.out.println("Верхний элемент: " + stack.peek());
                    case 8 -> { // Выход
                        System.out.println("Завершение работы программы");
                        return;
                    }
                    default -> // Некорректный ввод
                            System.out.println("Неверная команда! Введите число от 1 до 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("[Ошибка] Некорректный ввод! Требуется целое число");
                scanner.nextLine(); // Очистка буфера сканера
            } catch (IllegalStateException e) {
                System.out.println("[Ошибка операции] " + e.getMessage());
            }
        }
    }
}