package pet_amok;

public abstract class Dog extends VirtualPet {

    public Dog(String name, int happiness, int health, int hunger, int thirst, int waste) {
        super(name, happiness, health, hunger, thirst, waste);

    }

    public void walk() {

        setPetHappiness(getPetHappiness() + 5);
    }

    @Override
    public void tick() {

        setPetHappiness(getPetHappiness() - 2);
    }

}
