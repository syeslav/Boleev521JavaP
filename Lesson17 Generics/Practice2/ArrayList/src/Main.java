import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Т");
        inventory.add("y");
        inventory.add("1");
        inventory.add("T");
        System.out.println(inventory.remove("T"));
    }
}