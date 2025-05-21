import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список контактов
        List<Contact> phoneBook = new ArrayList<>();

        // Добавляем разные типы контактов
        phoneBook.add(new PersonalContact("Иван Иванов", "+79161234567",
                "ivan@example.com", "ул. Ленина, д. 10, кв. 5"));

        phoneBook.add(new BusinessContact("Петр Петров", "+79169876543",
                "petr@company.com", "ООО Технологии", "Менеджер"));

        phoneBook.add(new PersonalContact("Мария Сидорова", "+79167778899",
                "maria@example.com", "пр. Мира, д. 15, кв. 20"));

        phoneBook.add(new BusinessContact("Анна Кузнецова", "+79165554433",
                "anna@corp.com", "АО Финансы", "Бухгалтер"));

        // Демонстрируем полиморфизм - вызываем displayInfo() для всех контактов
        System.out.println("=== Телефонная книга ===");
        for (Contact contact : phoneBook) {
            contact.displayInfo(); // Вызовется соответствующая версия метода
        }
    }
}