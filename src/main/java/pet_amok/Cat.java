package pet_amok;

public class Cat extends VirtualPet implements OrganicPet {
    private final String name;
    private int happiness;
    private int hunger = 0;
    private int thirst = 0;
    private int waste = 0;
    private int health = 5;

    public Cat(String petName, String description, int happiness, int health, int hunger, int thirst, int waste, int tiredness, int boredom) {
        super(petName, description, happiness, health, hunger, thirst, waste, tiredness, boredom);
        this.name = petName;
        this.happiness = happiness;
        this.health = health;
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }


    private void setPetHealth(int health) {
        this.health = health;
    }


    @Override
    public void walk() {

    }

    @Override
    public void tick(){
        setHappiness(getPetHappiness() -1);
        setHunger(getHunger() + 1);
        setThirst(getThirst() + 1);
        setWaste(getWaste() + 1);
        if (getPetHappiness() <= 0 || getHunger() >= 10 || getWaste() >= 10);
        setPetHealth(getPetHealth() -1);

    }

    private int getPetHealth() {
        return health;
    }

    public void setHappiness(int i) {
    }

    public int getPetHappiness() {
        return happiness;
    }

    public void feed(){
        setHunger(getHunger() + 5);
    }

    public void water(){
        setThirst(getThirst() + 5);
    }

    public void emptyLitterBox(){
        setWaste(getWaste() - 5);
    }

    public int getWaste(){
        return waste;
    }

    public void setWaste(int waste){
        this.waste = waste;
    }

    public int getThirst(){
        return thirst;
    }

    public void setThirst(int thirst){
        this.thirst = thirst;
    }

    public int getHunger(){
        return hunger;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }
}


