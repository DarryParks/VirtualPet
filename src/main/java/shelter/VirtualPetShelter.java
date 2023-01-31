package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet petToAdd){
        this.pets.put(petToAdd.getPetName(), petToAdd);}

    public VirtualPet findPet(String petName){

        return this.pets.get(petName);
    }

    public void getAllPets() {
        for (Entry<String, VirtualPet> showPet : pets.entrySet()) {
            System.out.println(showPet.getValue().getPetName() + " " + showPet.getValue().petName);
        }
    }

    public Collection<shelter.VirtualPet> pets() {

        return pets.values();
    }

    public void adopt(String petName){

        this.pets.remove(petName);
    }

    public void feedAllPets(){
        for (Entry<String, VirtualPet> showPet : pets.entrySet()) {
            System.out.println(showPet.getValue().getHunger() + " " + showPet.getValue().petName);
        }
    }

    public void waterAllPets(){
        for (Entry<String, VirtualPet> showPet : pets.entrySet()) {
            System.out.println(showPet.getValue().getThirst() + " " + showPet.getValue().petName);
        }
    }

    public void playWithAllPets(){
        for (Entry<String, VirtualPet> showPet : pets.entrySet()) {
            System.out.println(showPet.getValue().getTiredness() + " " + showPet.getValue().petName);
        }
    }

    public void restAllPets(){
        for (Entry<String, VirtualPet> showPet : pets.entrySet()) {
            System.out.println(showPet.getValue().getTiredness() + " " + showPet.getValue().petName);
        }
    }



    public void waterPets(String petName, int waterAmount){ VirtualPet reduceThirstFromPet = findPet(petName);
        reduceThirstFromPet.waterPet(10);
    }

    public void playWithPets(String petName, int playAmount){
        shelter.VirtualPet reduceBoredomFromPet = findPet(petName);
        reduceBoredomFromPet.playWithPet(playAmount);

    }

    public void restPet(String petName, int restAmount){
        shelter.VirtualPet reduceTirednessFromPet = findPet(petName);
        reduceTirednessFromPet.restPet(restAmount);
    }

    public void showPets(){
        for(shelter.VirtualPet pet: pets.values()){
            System.out.println(  "Name: " +  pet.getPetName() + " Description: " + pet.getDescription() + " Hunger: " + pet.getHunger() + " Thirst: " + pet.getThirst() + " Boredom: " + pet.getBoredom() + " Tiredness: " + pet.getTiredness());
           /*System.out.println(pet.getPetName() + " " + pet.getDescription() + " " + pet.getThirst());
           System.out.println(pet.getPetName() + " " + pet.getDescription() + " " + pet.getBoredom());
           System.out.println(pet.getPetName() + " " + pet.getDescription() + " " + pet.getTiredness());*/
        }
    }


    public void removePet() {
    }
}
