public class Contact {
    protected String name;
    protected String phoneNumber;
    protected String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("Контакт: " + name);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}