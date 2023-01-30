package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, shelter.VirtualPet> pets = new HashMap<>();

    public void addPet(shelter.VirtualPet petToAdd){ pets.put(petToAdd.getPetName(), petToAdd);}

    public shelter.VirtualPet findPet(String petName){

        return pets.get(petName);
    }

    public Collection<shelter.VirtualPet> getAllPets() {
        return pets.values();
    }

    public Collection<shelter.VirtualPet> pets() {
        return pets.values();
    }

    public void adopt(shelter.VirtualPet petName){
        pets.remove(petName);
    }

    public void feedAllPets(){
        for(shelter.VirtualPet pet: pets.values()){
            pet.feedPet(10,5,3,6);
        }
    }

    public void waterAllPets(){
        for(shelter.VirtualPet pet: pets.values()){
            pet.waterPet(10);
        }
    }

    public void playWithAllPets(){
        for(shelter.VirtualPet pet: pets.values()){
            pet.playWithPet(10);
        }
    }

    public void restAllPets(){
        for(shelter.VirtualPet pet: pets.values()){
            pet.restPet(10);
        }
    }



    public void waterPets(String petName, int waterAmount){
        shelter.VirtualPet reduceThirstFromPet = findPet(petName);
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
