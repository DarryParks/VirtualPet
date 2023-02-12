package pet_amok;

public class RoboticCat extends VirtualRoboticPet implements RoboticPet {

    private int batteryLife;
    private int oil;

    public RoboticCat(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.setBatteryLife(batteryLife);
        this.setOil(oil);

    }

    @Override
    public void oil() {
        setBatteryLife(getBatteryLevel() + 5);
    }

    public int getBatteryLevel() {

        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {

    }

    public void setOil(int oil) {

    }

    @Override
    public void tick() {
        setRoboticPetHappiness(getRoboticPetHappiness() - 1);
        setBatteryLife(getBatteryLife() - 1);

        if (getBatteryLife() <= 10|| getBatteryLife() <= 5) {
            setRoboticPetHealth(getRoboticPetHealth() - 1);
        }}

    public int getBatteryLife() {
        return batteryLife;
    }
}

    

