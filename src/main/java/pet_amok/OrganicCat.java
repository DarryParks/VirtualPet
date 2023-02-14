package pet_amok;

public class OrganicCat extends VirtualOrganicPet implements OrganicPet {
    protected int hunger;
    protected int waste;


    public OrganicCat(String name, int happiness, int hunger, int health, int thirst, int waste) {
        super(name, happiness, health, hunger, thirst, waste);
        this.hunger = hunger;
        this.waste = waste;
        this.thirst = thirst;

    }

    @Override
    public void walk() {

    }

    @Override
    public void tick() {
        happiness -= 5;
        health -= 5;
        thirst +=5;
        hunger +=10;

    }

    public void feed() {
        setHunger(getHunger() + 5);
    }

    public void water() {
        setThirst(getThirst() + 5);
    }

    private void setThirst(int i) {

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
        int thirst = 23;
        return thirst;
    }


    public int getHunger() {
        return hunger = 13;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
