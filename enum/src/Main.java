import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox(GearBoxType.valueOf("ROBOT"));
        System.out.println(gearBox.getType());

        //получить массив всех констант этого enum
        System.out.println(Arrays.toString(GearBoxType.values()));

        //Перевести название  констансты в String
        System.out.println(GearBoxType.MANUAL.name());

        System.out.println(GearBoxType.MANUAL.ordinal());
    }
}