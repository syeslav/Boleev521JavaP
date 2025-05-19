import java.util.*;

public class DictionaryCRUD {
    // Версия 1: Одно значение для ключа
    static HashMap<String, String> dictionary = new HashMap<>();

    // Версия 2: Множественные значения для ключа
    static HashMap<String, List<String>> multiDictionary = new HashMap<>();

    public static void main(String[] args) {
        initDictionaries();
        showMenu();
    }

    private static void initDictionaries() {
        // Инициализация словарей
        dictionary.put("dog", "sobaka");
        dictionary.put("brother", "brat");
        dictionary.put("mother", "mama");
        dictionary.put("father", "otec");
        dictionary.put("home", "dom");

        multiDictionary.put("dog", new ArrayList<>(List.of("sobaka")));
        multiDictionary.put("brother", new ArrayList<>(List.of("brat")));
        multiDictionary.put("mother", new ArrayList<>(List.of("mama", "mat")));
        multiDictionary.put("father", new ArrayList<>(List.of("otec", "papa")));
        multiDictionary.put("home", new ArrayList<>(List.of("dom")));
    }

    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Меню управления словарем ===");
            System.out.println("1. Поиск перевода");
            System.out.println("2. Добавить запись");
            System.out.println("3. Удалить по ключу");
            System.out.println("4. Удалить по значению");
            System.out.println("5. Редактировать значение");
            System.out.println("6. Редактировать ключ");
            System.out.println("7. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Очистка буфера

            switch (choice) {
                case 1 -> searchWord(scanner);
                case 2 -> addWord(scanner);
                case 3 -> deleteByKey(scanner);
                case 4 -> deleteByValue(scanner);
                case 5 -> updateValue(scanner);
                case 6 -> updateKey(scanner);
                case 7 -> System.exit(0);
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    // 1. Удаление по ключу
    private static void deleteByKey(Scanner scanner) {
        System.out.print("Введите ключ для удаления: ");
        String key = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(key)) {
            dictionary.remove(key);
            System.out.println("Ключ '" + key + "' удален");
        } else {
            System.out.println("Ключ не найден!");
        }
    }

    // 2. Удаление по значению
    private static void deleteByValue(Scanner scanner) {
        System.out.print("Введите значение для удаления: ");
        String value = scanner.nextLine().toLowerCase();
        boolean removed = false;

        // Для обычного словаря
        Iterator<Map.Entry<String, String>> it = dictionary.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getValue().equals(value)) {
                it.remove();
                removed = true;
            }
        }

        System.out.println(removed ? "Значения удалены" : "Значения не найдены");
    }

    // 3. Редактирование значения
    private static void updateValue(Scanner scanner) {
        System.out.print("Введите ключ для редактирования: ");
        String key = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(key)) {
            System.out.print("Введите новое значение: ");
            String newValue = scanner.nextLine().toLowerCase();
            dictionary.put(key, newValue);
            System.out.println("Значение обновлено");
        } else {
            System.out.println("Ключ не найден!");
        }
    }

    // 4. Редактирование ключа
    private static void updateKey(Scanner scanner) {
        System.out.print("Введите старый ключ: ");
        String oldKey = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(oldKey)) {
            System.out.print("Введите новый ключ: ");
            String newKey = scanner.nextLine().toLowerCase();
            String value = dictionary.remove(oldKey);
            dictionary.put(newKey, value);
            System.out.println("Ключ изменен");
        } else {
            System.out.println("Старый ключ не найден!");
        }
    }

    // Поиск слова (пример из вашего кода)
    private static void searchWord(Scanner scanner) {
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(word)) {
            System.out.println(word + " (en) => " + dictionary.get(word) + " (ru)");
        } else if (dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    System.out.println(entry.getKey() + " (en) => " + entry.getValue() + " (ru)");
                    break;
                }
            }
        } else {
            System.out.print("Слово отсутствует. Добавить? (1-Да/2-Нет): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Введите перевод: ");
                String translation = scanner.nextLine().toLowerCase();
                dictionary.put(word, translation);
            }
        }
    }

    // Добавление слова (пример из вашего кода)
    private static void addWord(Scanner scanner) {
        System.out.print("Введите английское слово: ");
        String enWord = scanner.nextLine().toLowerCase();
        System.out.print("Введите русский перевод: ");
        String ruWord = scanner.nextLine().toLowerCase();
        dictionary.put(enWord, ruWord);
        System.out.println("Слово добавлено!");
    }
}