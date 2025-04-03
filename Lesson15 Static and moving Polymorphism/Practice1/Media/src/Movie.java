public class Movie extends Media {
    private final String director;
    private final int duration;

    public Movie(String id, String title, int year, String director, int duration)
            throws InvalidYearException {
        super(id, title, year);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Фильм: " + title);
        System.out.println("ID: " + id);
        System.out.println("Режиссер: " + director);
        System.out.println("Длительность: " + duration + " мин.");
        System.out.println("Год: " + year);
        System.out.println("Доступен: " + (isAvailable ? "Да" : "Нет") + "\n");
    }
}