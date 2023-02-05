package pet_amok;
public class Dog extends VirtualPet  implements OrganicPet{

    private  String name;
    private int happiness;
    private int hunger = 0;
    private int thirst = 0;
    private int waste = 0;
    private int health = 5;

    public Dog(String petName, String description, int happiness, int health, int hunger, int thirst, int waste, int tiredness, int boredom) {
        super(petName, description, happiness, health, hunger, thirst, waste, tiredness, boredom);
        this.name = petName;
        this.happiness = happiness;
        this.health = health;
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;


    }

    @Override
    public void walk(){
        setPetHappiness(getPetHappiness() +5);


    }

    private void setPetHappiness(int i) {

        setPetHappiness(getPetHappiness() +5);
    }


    public void tick() {

        setPetHappiness(getPetHappiness() -2);

    }

    @Override
    public void feed() {
    

    }

    @Override
    public void water() {

    }

}
