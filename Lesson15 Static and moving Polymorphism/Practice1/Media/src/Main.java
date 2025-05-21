public class Main {
    public static void main(String[] args) {
        try {
            Book warAndPeace = new Book("B001", "Война и мир", 1869, "Лев Толстой", "Роман");
            Movie godfather = new Movie("M001", "Крестный отец", 1972, "Фрэнсис Форд Коппола", 175);

            warAndPeace.displayInfo();
            godfather.displayInfo();

            warAndPeace.checkOut(); // Успешная аренда
            godfather.checkOut();

            warAndPeace.checkOut(); // Выбросит исключение
        } catch (MediaUnavailableException | InvalidYearException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}