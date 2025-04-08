public abstract class Animal {
    private String name;       // имя животного.
    private int age;           // возраст.
    private int health;  //уровень здоровья (по умолчанию 100).

    public Animal(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    // абстрактный метод (каждое животное издает уникальный звук).
    public abstract void makeSound();

    // увеличивает здоровье на 20 пунктов (не более 100).
    public void heal(int heal){
        heal = 20;
        if (this.health < 80) {
            this.health += heal;
        }
        System.out.println("Максимальный уровень здоровья: 100");
        return;
    }

    public void getAnimalType(){

    }


    // выводит информацию о животном.
    public void displayInfo(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Здоровье: " + health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
