public class Product {
    private String id;    // уникальный идентификатор товара
    private String name;  // название товара
    private double price; // цена товара
    private int quantity; // количество на складе

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * добавляет товар на склад
     **/
    public void restock(int amount) throws InvalidQuantityException {
        if (amount <= 0) {
            throw new InvalidQuantityException("Нельзя добавить " + amount + " единиц!");
        }
        quantity += amount;
    }

    /**
     * уменьшает количество товара
     **/
    public void sell(int amount) throws InsufficientStockException {
        if (amount <= 0) {
            throw new InvalidQuantityException("Нельзя продать " + amount + " единиц!");
        }
        if (quantity < amount) {
            throw new InsufficientStockException("Недостаточно товара '" + name + "' на складе!");
        }
        quantity -= amount;
        System.out.println(displayInfo());
    }

    /**
     * выводит информацию о товаре
     **/
    public char displayInfo() {
        System.out.println("Идентификатор товара: " + id + " Название товара: " + name + " Цена товара: " + price + " Количество на складе: " + quantity);
        return 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
