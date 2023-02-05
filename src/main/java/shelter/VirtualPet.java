package shelter;

public class VirtualPet {

    private String petName;
    private String description;
    private int petHappiness;
    private int petHealth;
    private int petHunger;
    private int petThirst;
    private int petWaste;

    public VirtualPet(String petName, String description, int petHappiness, int petHealth, int petHunger, int petThirst, int petWaste) {

        this.petName = petName;
        this.description = description;
        this.petHappiness = petHappiness;
        this.petHealth = petHealth;
        this.petHunger = petHunger;
        this.petThirst = petThirst;
        this.petWaste = petWaste;
    }

    public String getPetName() {
        return petName;

    }

    public String getDescription() {
        return description;

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

    public int getTiredness() {
        return tiredness;

    }

    // Behaviors
    public void feedPet(int feedAmount, int waterAmount, int restAmount, int playAmount) {
        hunger -= feedAmount;
        thirst -= waterAmount;
        tiredness += restAmount;
        boredom += playAmount;
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
    }
}


