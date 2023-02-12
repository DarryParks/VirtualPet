package pet_amok;

public class VirtualOrganicPet extends VirtualPet {
    private String petName;
    private int petHappiness;
    private int petHealth;
    private int petHunger;
    private  int petThirst;
    private int petWaste;




    public VirtualOrganicPet(String name, int happiness, int health, int hunger, int thirst, int waste)/*, int oilLevel, int maintenanceLevel)*/ {
        super(name);
        this.petName = name;
        this.petHappiness = 50;
        this.petHealth = 50;
        this.petHunger = 50;
        this.petThirst = 50;
        this.petWaste = 50;

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

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void play() {
        super.play();
    }

    public void tick() {
        petHappiness -= 20;
        petHealth -= 10;
    }


}



