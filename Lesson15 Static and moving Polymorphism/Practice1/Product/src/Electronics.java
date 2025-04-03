public class Electronics extends Product {
    private int warrantyPeriod; // срок гарантии в месяцах

    public Electronics(String id, String name, double price, int quantity, int warrantyPeriod) {
        super(id, name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public char displayInfo() {
        super.displayInfo();
        System.out.println("\"Гарантия: \" + warrantyPeriod + \" мес.\\n\"");
        return 0;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
