package pet_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> myShelter = new HashMap<String, VirtualPet>();

    public Collection<VirtualPet> availablePets() {
        return myShelter.values();
    }

    public void addPet(VirtualPet adoptablePet) {
        String petsAvailable = adoptablePet.getPetName();
        myShelter.put(petsAvailable, adoptablePet);
    }

    public void removePet(String upForAdoption) {
        myShelter.remove(upForAdoption);

    }

    //////


    public void addRoboticPet(VirtualRoboticPet adoptablePet) {
        String petsAvailable = adoptablePet.getRoboticPetName();
        myRoboticShelter.put(petsAvailable, adoptablePet);
    }

    public void removeRoboticPet(String upForAdoption) {
        myRoboticShelter.remove(upForAdoption);
    }


    ///////

    Map<String, VirtualRoboticPet> myRoboticShelter = new HashMap<String, VirtualRoboticPet>();

    public Collection<VirtualRoboticPet> availableRoboticPets() {
        return myRoboticShelter.values();
    }

    public void addRoboticPet(VirtualPet adoptablePet) {
        String petsAvailable = adoptablePet.getPetName();
        myShelter.put(petsAvailable, adoptablePet);
    }


    public void showAllPets(VirtualPet adoptablePet) {
        for (Map.Entry<String, VirtualPet> entry : myShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name: " + entry.getKey()
                    + "\t| Type: " + entry.getValue().getOrganicPetType()
                    + "\t| Health: " + entry.getValue().getPetHealth()
                    + "\t| Happiness: " + entry.getValue().getPetHappiness()
                    + "\t| Hunger: " + entry.getValue().getPetHunger()
                    + "\t| Thirst: " + entry.getValue().getPetThirst()
                    + "\t| Waste Level: " + entry.getValue().getWasteLevel()
            );

        }


    }


    public void showAllRoboticPets(VirtualRoboticPet adoptablePet) {
        for (Map.Entry<String, VirtualRoboticPet> entry : myRoboticShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name: " + entry.getKey()
                    + "\t| Type: " + entry.getValue().getRoboticPetType()
                    + "\t| Health: " + entry.getValue().getRoboticPetHealth()
                    + "\t| Happiness: " + entry.getValue().getRoboticPetHappiness()
                    + "\t| Oil Level: " + entry.getValue().getPetOilLevel()
                    + "\t| Maintenance Level: " + entry.getValue().getPetMaintenanceLevel()

            );
        }
    }

    public void getPetStats(VirtualPet adoptablePet) {
        for (Map.Entry<String, VirtualPet> entry : myShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name : " + entry.getKey() + "\t| Health " + entry.getValue().getPetHealth()
                    + "\t| Happiness: " + entry.getValue().getPetHappiness());
        }
    }

    public VirtualPet getPetNamed(String name) {
        return myShelter.get(name);
    }

    public void feedPets() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof OrganicPet) {
                OrganicPet organicPet = (OrganicPet) pet;
                organicPet.tick();
            } else if (pet instanceof RoboticPet) {
                RoboticPet roboticPet = (RoboticPet) pet;
                roboticPet.tick();
            }


        }
    }

    public void tickAllPets(VirtualPet adoptablePet) {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof OrganicPet) {
                OrganicPet organicPet = (OrganicPet) pet;
                organicPet.water();
            }

        }

    }

    public void waterAllPets() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof RoboticPet) {
                RoboticPet roboticPet = (RoboticPet) pet;
                roboticPet.oil();
            }
        }
    }

    public void oilAllRobots() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof RoboticPet) {
                RoboticPet roboticPet = (RoboticPet) pet;
                roboticPet.oil();
            }
        }
    }

    public boolean hasPets() {
        return !myShelter.isEmpty();
    }

    public void cleanAllCages() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.cleanCages();
            }
        }
    }

    public void emptyLitterBox() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet;
                organicCat.emptyLitterBox();
            }
        }
    }

    public void walkDogs() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof Dog) {
                Dog aDog = (Dog) pet;
            }
        }
    }

    public void showPetName(VirtualPet pet) {
        for (Map.Entry<String, VirtualPet> entry : myShelter.entrySet()) {
            System.out.println(entry.getKey() + "\n");
        }
    }


}