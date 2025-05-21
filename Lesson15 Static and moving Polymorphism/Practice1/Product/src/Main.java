public class Main {
    public static void main(String[] args) {
        try {
            // Создаем товары
            Electronics laptop = new Electronics("E1", "Ноутбук", 50000, 5, 12);
            Clothing tShirt = new Clothing("C1", "Футболка", 1500, 10, "L");

            // Выводим информацию
            laptop.displayInfo();
            tShirt.displayInfo();

            // Пополняем запасы
            laptop.restock(3);
            tShirt.restock(5);

            // Продаем товары
            laptop.sell(2);
            tShirt.sell(15); // Вызовет исключение

        } catch (InvalidQuantityException | InsufficientStockException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}