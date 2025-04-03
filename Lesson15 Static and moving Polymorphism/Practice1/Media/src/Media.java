public class Media {
    public String id;
    public String title;
    public int year;
    public boolean isAvailable;

    public Media(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    // арендовать ресурс
    public void checkOut(){
        if (!isAvailable) {
            throw new MediaUnavailableException(title + " уже арендован!");
        }
        isAvailable = false;
        System.out.println(title + " арендован.");
    }

    // вернуть ресурс
    public void returnMedia(){
        isAvailable = true;
        System.out.println(title + " возвращен.");
    }

    // выводит общую информацию
    public void displayInfo(){
        System.out.println("Уникальный идентификатор: " + id);
        System.out.println("Название: " + title);
        System.out.println("Год выпуска: " + year);
        System.out.println("Доступ: " + isAvailable);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
