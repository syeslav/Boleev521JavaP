import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Создаем TreeSet с кастомным компаратором
        TreeSet<Product> products = new TreeSet<>(
                Comparator.comparingDouble(Product::getPrice)  // Сначала по цене (возрастание)
                        .thenComparingInt(Product::getRating).reversed()  // Затем по рейтингу (убывание)
        );

        // Добавляем товары
        products.add(new Product("Ноутбук", 999.99, 5));
        products.add(new Product("Смартфон", 499.99, 4));
        products.add(new Product("Планшет", 499.99, 5)); // Та же цена, но выше рейтинг
        products.add(new Product("Наушники", 99.99, 3));
        products.add(new Product("Часы", 199.99, 4));

        // Выводим отсортированный список
        System.out.println("Товары отсортированы по цене (↑) и рейтингу (↓):");
        products.forEach(System.out::println);
    }
}