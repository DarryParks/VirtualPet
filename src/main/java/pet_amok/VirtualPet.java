package pet_amok;

public class VirtualPet {

    private String petName;
    private String description;
    private int happiness;
    private int health;
    private int hunger;
    private int thirst;
    private int waste;
    private int tiredness;
    private int boredom;


    public VirtualPet(String petName, String description, int happiness, int health, int hunger, int thirst, int waste, int tiredness, int boredom) {

        this.petName = petName;
        this.description = description;
        this.happiness = happiness;
        this.health = health;
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.tiredness = tiredness;
        this.boredom = boredom;
    }

    public String getPetName() {
        return petName;

    }



    public String getDescription() {
        return description;

    }

    public int getPetHappiness() {
        return happiness;
    }

    public int getHunger() {

        return hunger;
    }

    public int getThirst() {

        return thirst;
    }

    public int getBoredom() {

        return boredom;
    }

    public int getTiredness(){
        return tiredness;
    }

    // Behaviors
    public void feedPet(int feedAmount, int waterAmount, int restAmount, int playAmount, int happinessAmount) {
        hunger -= feedAmount;
        thirst -= waterAmount;
        tiredness += restAmount;
        boredom += playAmount;
        happiness += happinessAmount;
    }


    public void playWithPet(int playAmount) {
        boredom -= playAmount;

    }

    public void waterPet(int waterAmount) {
        thirst -= waterAmount;

    }

    public void restPet(int restAmount) {
        tiredness -= restAmount;
    }

    public void petDisplay() {
        System.out.println("Name: " + getPetName());
        System.out.println("Pet Description: " + getDescription());
        System.out.println("Hunger: " + getHunger());
        System.out.println("Thirst: " + getThirst());
        System.out.println("Boredom: " + getBoredom());
        System.out.println("Tiredness: " + getTiredness());
    }

    public void tick() {
        this.hunger += 5;
        this.tiredness += 5;
        this.thirst += 5;
        this.boredom += 5;
        this.tiredness +=5;
        this.happiness +=5;
    }

    protected void walk() {
    }
}

