package shelter;

public class VirtualPet {

    String petName;
    String description;
    int hunger;
    int thirst;
    int boredom;
    int tiredness;

    public VirtualPet(String petName, String description, int hunger, int thirst, int boredom, int tiredness) {

        this.petName = petName;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tiredness = tiredness;
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
}


