package virtual_pet;

public class VirtualPet {
    int hunger;
    int thirst;
    int boredom;
    int tiredness;
    String petName;

    public VirtualPet (String petName, int hunger, int thirst, int boredom, int tiredness){
        this.petName = petName;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tiredness = tiredness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom(){
        return boredom;
    }

    public int getTiredness(){
        return tiredness;

    }
    // Behaviors
    public void feedPet(int feedAmount){
        hunger += feedAmount;
    }

    public void waterPet(int waterAmount){
        thirst += waterAmount;
    }
    public void playWithPet(int playAmount){
        boredom += playAmount;

    }
    public void restPet( int restAmount){
        tiredness += restAmount;

    }

    public void petDisplay(){

    }

}