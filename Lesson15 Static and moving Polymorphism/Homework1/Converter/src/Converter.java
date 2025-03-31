public class Converter {

    // Конвертация длины (перегруженные методы)

    /**
     * Метод конвертирует метры в футы
     * @param meters значение в метрах
     * @return значение в футах
     */
    public static double convertLength(double meters) {
        return meters * 3.28084;
    }

    /**
     * Метод конвертирует футы в метры
     * @param feet значение в футах
     * @return значение в метрах
     */
    public static double convertLength(int feet) {
        return feet / 3.28084;
    }

    /**
     * Универсальная конвертация длины
     * @param value исходное значение
     * @param fromUnit исходная единица (m, cm, mm)
     * @param toUnit целевая единица (m, cm, mm)
     * @return результат конвертации
     */
    public static double convertLength(double value, String fromUnit, String toUnit) {
        // Конвертируем в метры
        double meters;
        switch (fromUnit.toLowerCase()) {
            case "cm": meters = value / 100; break;
            case "mm": meters = value / 1000; break;
            default: meters = value; // м по умолчанию
        }

        // Конвертируем из метров в целевую единицу
        switch (toUnit.toLowerCase()) {
            case "cm": return meters * 100;
            case "mm": return meters * 1000;
            default: return meters; // м по умолчанию
        }
    }

    // Конвертация температуры

    /**
     * Цельсий -> Фаренгейт
     * @param celsius температура в градусах Цельсия
     * @return температура в градусах Фаренгейта
     */
    public static double convertTemperature(double celsius) {
        return celsius * 9/5 + 32;
    }

    /**
     * Фаренгейт -> Цельсий
     * @param fahrenheit температура в градусах Фаренгейта
     * @return температура в градусах Цельсия
     */
    public static double convertTemperature(int fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Конвертация веса

    /**
     * Килограммы -> Фунты
     * @param kg значение в килограммах
     * @return значение в фунтах
     */
    public static double convertWeight(double kg) {
        return kg * 2.20462;
    }

    /**
     * Фунты -> Килограммы
     * @param pounds значение в фунтах
     * @return значение в килограммах
     */
    public static double convertWeight(int pounds) {
        return pounds / 2.20462;
    }

    public static void main(String[] args) {
        // Демонстрация работы

        // Конвертация длины
        System.out.println("5 метров = " + convertLength(5) + " футов");
        System.out.println("10 футов = " + convertLength(10) + " метров");
        System.out.println("2 метра в см: " + convertLength(2, "m", "cm"));
        System.out.println("150 см в мм: " + convertLength(150, "cm", "mm"));

        // Конвертация температуры
        System.out.println("\n20°C = " + convertTemperature(20) + "°F");
        System.out.println("68°F = " + convertTemperature(68) + "°C");

        // Конвертация веса
        System.out.println("\n10 кг = " + convertWeight(10) + " фунтов");
        System.out.println("22 фунта = " + convertWeight(22) + " кг");
    }
}