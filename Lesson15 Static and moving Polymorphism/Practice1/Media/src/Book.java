public class Book extends Media {
    private final String author;
    private final String genre;

    public Book(String id, String title, int year, String author, String genre) {
        super(id, title, year);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + title);
        System.out.println("ID: " + id);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Год: " + year);
        System.out.println("Доступна: " + (isAvailable ? "Да" : "Нет") + "\n");
    }
}