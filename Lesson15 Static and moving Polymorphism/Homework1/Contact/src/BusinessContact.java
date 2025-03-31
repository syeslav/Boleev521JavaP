public class BusinessContact extends Contact {
    private String companyName;
    private String position;

    public BusinessContact(String name, String phoneNumber, String email,
                           String companyName, String position) {
        super(name, phoneNumber, email);
        this.companyName = companyName;
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Деловой контакт ===");
        super.displayInfo();
        System.out.println("Компания: " + companyName);
        System.out.println("Должность: " + position);
        System.out.println();
    }
}