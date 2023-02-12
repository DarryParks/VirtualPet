package pet_amok;

public abstract class VirtualOrganicPet extends VirtualPet implements OrganicPet{
    private String name;
    private int hunger;
    private int thirst;
    private int waste;



    public VirtualOrganicPet(String name, int happiness, int health, int hunger, int thirst, int waste)/*, int oilLevel, int maintenanceLevel)*/ {
        super(name, happiness, health);

        this.thirst = thirst;
        this.hunger = hunger;
        this.waste = waste;


    }

    // Getters
  @Override
    public String getOrganicPetType() {
        return "Organic";
    }

    public int getPetThirst() {
        return thirst;
    }

    public int getWasteLevel() {
        int petWaste = 20;
        return petWaste;
    }


    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void water() {

    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void walk() {

    }

    public void tick() {
    }


}



