public class BusinessContact extends Contact {
    private final String companyName;
    private final String position;

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

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }
}