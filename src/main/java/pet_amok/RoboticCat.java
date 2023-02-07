package pet_amok;

public class RoboticCat extends VirtualRoboticPet implements RoboticPet {

    private int maintenance;
    private int oil;

    public RoboticCat(String name, int happiness, int health, int oil, int maintenance) {
        super(name, happiness, health, oil, maintenance);
        this.setMaintenance(maintenance);
        this.setOil(oil);

    }

    @Override
    public void oil() {
        setMaintenance(getPetMaintenanceLevel() + 5);
    }

    public int getPetMaintenanceLevel() {

        return maintenance;
    }

    public void setMaintenance(int maintenance) {

    }

    public void setOil(int oil) {

    }


}
