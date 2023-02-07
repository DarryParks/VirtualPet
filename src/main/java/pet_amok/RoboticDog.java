package pet_amok;

public class RoboticDog extends VirtualRoboticPet implements RoboticPet {

    private int maintenance;
    private int oil;

    public RoboticDog(String name, int happiness, int health, int oil, int maintenance) {
        super(name, happiness, health, oil, maintenance);
        this.setMaintenance(maintenance);
        this.setOil(oil);

    }

    @Override
    public void tick() {
        setRoboticPetHappiness(getRoboticPetHappiness() - 1);
        setMaintenance(getMaintenance() - 1);

        if (getMaintenance() <= 0 || getMaintenance() <= 0) {
            setRoboticPetHealth(getRoboticPetHealth() - 1);
        }
    }

    public void oil() {
        setMaintenance(getMaintenance() + 5);
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
