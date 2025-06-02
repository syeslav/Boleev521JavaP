/*Todo:     Фильтрация и сборка:
o	Создайте список объектов Person с полями name, age и gender.
o	Используя Stream, отфильтруйте только женщин старше 18 лет.
o	Соберите их имена в новый список.

 */

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
