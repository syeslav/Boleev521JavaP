public class Lion extends Animal implements Predator {

    public Lion(String name, int age, int health) {
        super(name, age, health);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " рычит: Ррррр!");
    }

    @Override
    public void hunt(Animal prey) {
        System.out.println(getName() + " атакует " + prey.getName() + "!");
        prey.reduceHealth(30);
        this.health -= 10;

        if (this.health <= 0) {
            throw new AnimalHealthException(getName() + " погиб от истощения!");
        }
    }

    @Override
    public String getAnimalType() {
        return "Млекопитающее";
    }
}