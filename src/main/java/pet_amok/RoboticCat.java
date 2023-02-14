package pet_amok;

public class RoboticCat extends VirtualRoboticPet implements RoboticPet {

    protected int batteryLife;
    protected int oil;


    public RoboticCat(String name, int happiness, int health, int oil, int batteryLife) {
        super(name, happiness, health, oil, batteryLife);
        this.batteryLife = batteryLife;
        this.oil = oil;

    }

    @Override
    public void oil() {
        batteryLife -= 5;
        oil -= 5;
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
        batteryLife -= 5;
        oil -= 5;

    }

    public int getBatteryLife() {
        return batteryLife = 30;
    }
}

    

