package pet_amok;

public class VirtualPet {
    private String name;
    private int happiness;
    private int health;
    private int petWaste;

    public VirtualPet(String name, int happiness, int health, int petWaste) {
        this.name = name;
        this.happiness = happiness;
        this.health = health;
        this.petWaste = petWaste;

    }


    // Getters
    public String getName() {
        return name;
    }

    public String getOrganicPetType() {
        return "Organic";
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    public int getWasteLevel() {
        return petWaste;
    }


    public void setHappiness(int happiness) {
        this.happiness = happiness;

    }

    public void setHealth(int health) {
        this.health = health;

    }

    public void play() {
        happiness += 10;
        health += 10;
        petWaste  -= 22;

        // add code here
    }

    public void feed() {
        happiness += 10;
        health += 10;
        petWaste  -= 22;

//        if (petHunger == 20) {
//            System.out.println("Please feed Pet before Health declines");
//        }
    }


    public void tick() {
        happiness -= 5;
        health -= 5;
        petWaste  = 22;
    }

    public void petHappiness() {
        happiness -= 5;
        health -= 5;
        petWaste  = 22;

    }}


