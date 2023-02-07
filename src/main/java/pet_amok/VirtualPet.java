package pet_amok;

public class VirtualPet {
    private String petName;
    private int petHappiness;
    private int petHealth;
    private int petHunger;
    private int petThirst;
    private int petWaste;


    public VirtualPet(String name, int happiness, int health, int hunger, int thirst, int waste)/*, int oilLevel, int maintenanceLevel)*/{
        petName = name;
        petHappiness = happiness;
        petHealth = health;
        petHunger = hunger;
        petThirst = thirst;
        petWaste = waste;

    }
    // Getters
    public String getPetName(){
        return petName;
    }

    public String getOrganicPetType(){
        return "Organic";
    }

    public int getPetHappiness(){
        return petHappiness;
    }

    public int getPetHunger(){
        return petHunger;
    }

    public int getPetThirst(){
        return petThirst;
    }

    public int getPetHealth(){
        return petHealth;
    }
    public int getWasteLevel() {
        return petWaste;
    }



    // Setters
    public void setPetName(String petName){
        this.petName = petName;

    }

    public void setPetHappiness(int petHappiness){
        this.petHappiness = petHappiness;

    }

    public void setPetHealth(int petHealth){
        this.petHealth = petHealth;

    }

    public void play(){
        petHappiness += 10;

        if(petHunger <= 20){
            System.out.println("Please feed Pet before Health declines");
        }
    }

    public  void tick(){
        petHappiness -= 20;
        petHealth -= 10;
    };



}



