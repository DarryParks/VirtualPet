package pet_amok;

public class VirtualOrganicPet extends VirtualPet implements OrganicPet{
    private String petName;
    private int thirst;
    private int petWaste;



    public VirtualOrganicPet(String name, int happiness, int health, int hunger, int thirst, int petWaste)/*, int oilLevel, int maintenanceLevel)*/ {
        super(name, happiness, health, hunger);

        this.thirst = thirst;
        this.petWaste = petWaste;

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



