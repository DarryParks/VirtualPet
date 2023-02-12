package pet_amok;

public class VirtualRoboticPet extends VirtualPet{
    private String roboticPetName;
    private int roboticPetHappiness;
    private int roboticPetHealth;
    private int petOilLevel;
    private int BatteryLevel;


    public VirtualRoboticPet(String name, int roboticHappiness, int roboticHealth, int oilLevel, int BatteryLevel){
        super(name);
        this.roboticPetName = name;
        this.roboticPetHappiness = roboticHappiness;
        this.roboticPetHealth = roboticHealth;
        this.petOilLevel = oilLevel;
        this.BatteryLevel = BatteryLevel;
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

    public int getPetOilLevel() {
        return petOilLevel;
    }

    public int getRoboticPetHealth(){
        return roboticPetHealth;
    }

    public int getBatteryLevel() {
        return BatteryLevel;
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

        if(petOilLevel<= 20){
            System.out.println("Please oil Robotic Pet before Health declines");
        }
    }

    public  void tick(){
        roboticPetHappiness -= 20;
        roboticPetHealth -= 10;

    }




}
