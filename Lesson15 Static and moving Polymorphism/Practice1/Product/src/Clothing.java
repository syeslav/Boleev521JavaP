public class Clothing extends Product {
    private final String size; // размер одежды (например, "M", "L")

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    @Override
    public char displayInfo() {
        super.displayInfo();
        System.out.println("Размер: " + size + "\n");
        return 0;
    }
}
    /*Clothing (одежда):
   Доп. поле: size (String) — размер одежды (например, "M", "L").
    Переопределите displayInfo(), чтобы выводить размер.*/
