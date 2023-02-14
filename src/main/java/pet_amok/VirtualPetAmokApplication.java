package pet_amok;

import java.util.Scanner;

public class VirtualPetAmokApplication {
    public static void main(String[] args) {

        VirtualPet pet = new OrganicDog("Oscar ", 10, 10, 10, 10, 10);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.addPet(pet);

        VirtualRoboticPet pet2 = new RoboticDog("Wrigley ", 10, 10, 20, 10);
        VirtualPetShelter myRoboticShelter = new VirtualPetShelter();
        myRoboticShelter.addRoboticPet(pet2);

        VirtualPet pet3 = new OrganicCat("Raymond ", 10, 10, 20, 15, 10) ;
        VirtualPetShelter myShelter2 = new VirtualPetShelter();
        myShelter.addPet(pet3);


        VirtualRoboticPet pet4 = new RoboticCat("Whiskers ", 10, 10, 10, 10);
        VirtualPetShelter myRoboticShelter2 = new VirtualPetShelter();
        myRoboticShelter2.addRoboticPet(pet4);

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Playful pet looking for parents");

        String showMenu = """

                \t	Please choose an option:\s

                \t  1. Feed organic pet
                \t  2. Water organic pet
                \t  3. Clean the dog and cat cages.
                \t  4. Clean the litter box.
                \t  5. Walk the dogs.
                \t  6. Oil Robotic Pets.\s
                \t  7. Adopt a pet
                \t  8. Admit a pet
                \t  9. Play with a pet\s
                \t 10. Show pet in shelter
                \t 11. Quit""";

        String userChoice;
        // while (myShelter.hasPets()) {
        do {
            System.out.println(showMenu);
            userChoice = input.nextLine();
            switch (userChoice) {
                //feeding all organic animals.
                case "1" -> {
                    myShelter.tickAllPets(pet);
                    myShelter2.tickAllPets(pet3);
                    myShelter2.showOrganicPets();
                    myShelter.feedPets(pet);
                    System.out.println();
                    System.out.println("You feed all organic pet");
                }
                //water organic pet
                case "2" -> {
                    myShelter2.tickAllPets(pet);
                    myShelter2.tickAllPets(pet3);
                    myShelter2.showOrganicPets();
                    myShelter2.showOrganicPets();
                    myShelter.waterAllPets();
                    System.out.println("You watered all organic pet");
                }
                //Clean all dogs cages.
                case "3" -> {
                    myShelter.tickAllPets(pet);
                    myShelter.tickAllPets(pet3);
                    myShelter.showOrganicPets();
                    myShelter.cleanAllCages();
                    System.out.println("Organic Dog and Cat cage cleaned");
                }
                case "4" -> {
                    myShelter2.tickAllPets(pet);
                    myShelter2.showOrganicPets();
                    myShelter2.emptyLitterBox();
                    System.out.println();
                    System.out.println("LitterBox Cleaned ");
                    System.out.println("Litter has been replaced in cats litter box. ");
                }
                //Walk all dogs.
                case "5" -> {
                    myShelter2.tickAllPets(pet);
                    myShelter2.showOrganicPets();
                    myRoboticShelter.showAllRoboticPets();
                    myShelter.showOrganicPets();
                    myRoboticShelter2.showAllRoboticPets();
                    myShelter2.walkDogs();
                    System.out.println("All organic and robotic pet have been walked ");
                }
                //Oil all Robotic Pets
                case "6" -> {
                    myShelter2.showOrganicPets();
                    myRoboticShelter.showAllRoboticPets();
                    myRoboticShelter2.showAllRoboticPets();
                    myShelter.tickAllPets(pet);
                    myShelter.tickAllPets(pet3);
                    myShelter.oilAllRobots();
                    System.out.println();
                    System.out.println("All robotic pet parts have been oiled ");
                }
                //Pet adoption.
                case "7" -> {
                    myShelter.tickAllPets(pet);
                    myShelter2.tickAllPets(pet3);
                    myShelter.showOrganicPets();
                    System.out.println("Would you like to adopt one of the pet? ");
                    String upForAdoptions = input.nextLine();
                    myShelter.removePet(upForAdoptions);
                    System.out.println("Pet has been adopted " + upForAdoptions);
                }
                //Add a pet.
                case "8" -> {
                    myShelter.tickAllPets(pet);
                    System.out.println(
                            "Do you have a: \n\t A. Organic Dog \n\t B. Organic Cat \n\t C. Robotic Dog \n\t D. Robotic Cat");
                    String petType = input.nextLine();
                    switch (petType.toUpperCase()) {
                        // Add organic dog.
                        case "A" -> {
                            System.out.println("Name the Dog");
                            String organicDogName = input.nextLine();
                            VirtualPet newOrganicDog = new OrganicCat(organicDogName, 10, 10, 10, 10, 10);
                            myShelter.addPet(newOrganicDog);
                        }

                        // Add organic cat.
                        case "B" -> {
                            System.out.println("Please name the new cat: ");
                            String organicCatName = input.nextLine();
                            VirtualPet newOrganicCat = new OrganicCat(organicCatName, 10, 10, 0, 0, 0);
                            myShelter.addPet(newOrganicCat);
                        }
                        // Add robotic dog.
                        case "C" -> {
                            System.out.println("Please name the new robotic dog: ");
                            String roboticDogName = input.nextLine();
                            VirtualRoboticPet newRoboticDog = new RoboticDog(roboticDogName, 10, 10, 0, 10);
                            myRoboticShelter.addRoboticPet(newRoboticDog);
                        }
                        // Add robotic cat.
                        case "D" -> {
                            System.out.println("Please name the new robotic cat: ");
                            String roboticCatName = input.nextLine();
                            VirtualRoboticPet newRoboticCat = new RoboticCat(roboticCatName, 10, 10, 10, 10);
                            myRoboticShelter.addRoboticPet(newRoboticCat);
                        }
                    }
                    System.out.println("Congratulations! You've got a new pet!");
                }

                // play wit pet
                case "9" -> {
                    myShelter.tickAllPets(pet);
                    System.out.println("Which pet would you like to play with?");
                    System.out.println();
                    myShelter.showPetName(pet);
                    String chosenPet = input.nextLine();
                    VirtualPet playPet = myShelter.getPetNamed(chosenPet);
                    playPet.play();
                    System.out.println(chosenPet + " had a great time!");
                }
                case "10" -> {
                    myShelter.tickAllPets(pet);
                    myShelter.tickAllPets(pet2);
                    System.out.println("These are the pet in the shelter: ");
                    myShelter.showOrganicPets();
                    myRoboticShelter.showAllRoboticPets();
                    myShelter2.showOrganicPets();
                    myRoboticShelter2.showAllRoboticPets();
                }

                // System.out.println(myShelter.showOrganicPets(playPet);
                case "11" -> {
                    System.out.println("See you next time!");
                    System.exit(0);
                }
                default -> System.out.println("error, Try again.");
            }

            myShelter.tickAllPets(pet);
        } while (myShelter.hasPets());
        // //(!myShelter.hasPets()) ;

        input.close();


    }
}
