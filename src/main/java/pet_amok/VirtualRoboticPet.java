package pet_amok;

public class VirtualRoboticPet extends VirtualPet{
    protected String roboticPetName;
   protected int roboticPetHappiness;
   protected int roboticPetHealth;
   private int oil;
   private int batteryLife;



    public VirtualRoboticPet(String name, int happiness, int health, int oilLevel, int batteryLife){
        super(name,happiness, health);
        this.roboticPetName = name;
        this.roboticPetHappiness = happiness;
        this.roboticPetHealth = health;
        this.oil = oil;
        this.batteryLife = batteryLife;
    }

    // Getters
    public String getRoboticPetName(){
        return roboticPetName;
    }

    public String getRoboticPetType(){
        return "Robotic";
    }

    public int getRoboticPetHappiness(){
        return roboticPetHappiness;
    }

    public void oil() {

        oil -= 5;
    }

    public int getRoboticPetHealth(){
        return roboticPetHealth;
    }

    public int getBatteryLevel() {
        return batteryLife;
    }



    // Setters
    public void setRoboticPetName(String roboticPetName){
        this.roboticPetName = roboticPetName;

    }

    public void setRoboticPetHappiness(int roboticPetHappiness){
        this.roboticPetHappiness = roboticPetHappiness;

    }

    public void setRoboticPetHealth(int roboticPetHealth){
        this.roboticPetHealth = roboticPetHealth;

    }

    public void play(){
        roboticPetHappiness += 10;

        if(oil<= 20){
            System.out.println("Please oil Robotic Pet before Health declines");
        }
    }

    public void tick(){
        roboticPetHappiness -= 20;
        roboticPetHealth -= 10;

    }




}
