package pet_amok;

public class VirtualPet {
    private String petName;
    private int petHappiness;
    private int petHealth;
    private int petHunger;
    private  int petThirst;
    private int petWaste;


    public VirtualPet(String name, int happiness, int health, int hunger, int thirst, int waste)/*, int oilLevel, int maintenanceLevel)*/ {
        petName = name;
        petHappiness = happiness;
        petHealth = health;
        petHunger = hunger;
        petThirst = thirst;
        petWaste = waste;

    }

    public VirtualPet(String name) {
        petName = name;
        petHappiness = 20;
        petHealth = 15;
        petHunger = 3;
        petThirst = 34;
        petWaste = 22;

    }

    // Getters
    public String getPetName() {
        return petName;
    }

    public String getOrganicPetType() {
        return "Organic";
    }

    public int getPetHappiness() {
        return petHappiness;
    }

    public int getPetHunger() {
        return petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public int getPetHealth() {
        return petHealth;
    }

    public int getWasteLevel() {
        return petWaste;
    }


    // Setters
    public void PetName(String petName) {
        this.petName = petName;

    }

    public void setPetHappiness(int petHappiness) {
        this.petHappiness = petHappiness;

    }

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;

    }

    public void play() {
        petHappiness += 10;
        petHealth += 10;
        petHunger += 5;
        petThirst += 10;
        petWaste  -= 22;

       // add code here
    }

    public void feed() {
        petHappiness += 10;
        petHealth += 10;
        petHunger += 5;
        petThirst += 10;
        petWaste  -= 22;

        if (petHunger == 20) {
            System.out.println("Please feed Pet before Health declines");
        }
    }


    public void getWasteLevel(){
        petHappiness += 10;
        petHealth += 10;
        petHunger += 5;
        petThirst += 10;


    }

    public void tick() {
        petHappiness -= 5;
        petHealth -= 5;
        petHunger += 5;
        petThirst += 10;
        petWaste  = 22;
    }
    
}



