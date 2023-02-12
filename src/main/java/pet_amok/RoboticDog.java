package pet_amok;

public class RoboticDog extends VirtualRoboticPet implements RoboticPet {

    private int batteryLife;
    private int oil;

    public RoboticDog(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.setBatteryLife(batteryLife);
        this.setOil(oil);

    }

    @Override
    public void tick() {
        setRoboticPetHappiness(getRoboticPetHappiness() - 1);
        setBatteryLife(getBatteryLife() - 1);

        if (getBatteryLife() <= 10|| getBatteryLife() <= 5) {
            setRoboticPetHealth(getRoboticPetHealth() - 1);
        }
    }

    public void oil() {
        setBatteryLife(getBatteryLife() + 5);
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
