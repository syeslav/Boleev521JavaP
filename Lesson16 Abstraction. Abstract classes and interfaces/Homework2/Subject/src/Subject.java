public abstract class Subject {
    private String subjectName;
    private String teacher;

    public Subject(String subjectName, String teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
    }

    // Методы для получения информации
    public String getSubjectName() {
        return subjectName;
    }

    public String getTeacher() {
        return teacher;
    }

    // Абстрактный метод для изучения предмета
    public abstract void study();
}