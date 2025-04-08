public class PersonalContact extends Contact {
    private final String address;

    public PersonalContact(String name, String phoneNumber, String email, String address) {
        super(name, phoneNumber, email);
        this.address = address;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Личный контакт ===");
        super.displayInfo();
        System.out.println("Адрес: " + address);
        System.out.println();
    }
}