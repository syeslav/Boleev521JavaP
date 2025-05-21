public class Main {
    public static void main(String[] args) {
        Subject[] schedule = {
                new Math(),
                new History(),
                new Science()
        };

        System.out.println("=== Расписание занятий ===");
        for (Subject subject : schedule) {
            subject.study();
        }
    }
}