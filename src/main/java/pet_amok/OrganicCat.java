package pet_amok;

public class OrganicCat extends VirtualOrganicPet implements OrganicPet {
    private int hunger;
    private int waste;

    public OrganicCat(String name, int happiness, int hunger, int health, int waste) {
            super(name, happiness, health, hunger, thirst, waste);
        this.hunger = hunger;
        this.waste = waste;

    }

    @Override
    public void walk() {

    }

    @Override
    public void tick() {

    }

    public void feed() {
        setHunger(getHunger() + 5);
    }

    public void water() {
        setThirst(getThirst() + 5);
    }

    public void emptyLitterBox() {
        setWaste(getWaste() - 5);
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
