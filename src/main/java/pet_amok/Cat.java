package pet_amok;

public class Cat extends VirtualPet {

    public Cat(String name, int happiness, int health, int hunger, int thirst, int waste){
        super(name, happiness, health, hunger, thirst, waste);

    }

    @Override
    public void tick(){
        setPetHappiness(getPetHappiness() -1);
    }
}
