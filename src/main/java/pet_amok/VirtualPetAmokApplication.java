package pet_amok;

import java.util.Scanner;

public class VirtualPetAmokApplication {
    public static void main(String[] args) {

        VirtualPet pets = new OrganicDog("Oscar ", 10, 10, 10, 10, 10);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.addPet(pets);

        VirtualRoboticPet pets2 = new RoboticDog("Wrigley ", 10, 10, 20, 10);
        VirtualPetShelter myRoboticShelter = new VirtualPetShelter();
        myRoboticShelter.addRoboticPet(pets2);

        VirtualPet pets3 = new OrganicCat("Raymond ", 10, 10, 20, 15, 10) ;
        VirtualPetShelter myShelter2 = new VirtualPetShelter();
        myShelter.addPet(pets3);


        VirtualRoboticPet pets4 = new RoboticCat("Whiskers ", 10, 10, 10, 10);
        VirtualPetShelter myRoboticShelter2 = new VirtualPetShelter();
        myRoboticShelter2.addRoboticPet(pets4);

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Playful pets looking for parents");

        String showMenu = """

                \t	Please choose an option:\s

                \t  1. Feed organic pets
                \t  2. Water organic pets
                \t  3. Clean the dog and cat cages.
                \t  4. Clean the litter box.
                \t  5. Walk the dogs.
                \t  6. Oil Robotic Pets.\s
                \t  7. Adopt a pet
                \t  8. Admit a pet
                \t  9. Play with a pet\s
                \t 10. Show pets in shelter
                \t 11. Quit""";

        String userChoice;
        // while (myShelter.hasPets()) {
        do {
            System.out.println(showMenu);
            userChoice = input.nextLine();
            switch (userChoice) {
                //feeding all organic animals.
                case "1" -> {
                    myShelter.tickAllPets(pets);
                    myShelter2.tickAllPets(pets3);
                    myShelter2.showOrganicPets();
                    myShelter.feedPets(pets);
                    System.out.println();
                    System.out.println("You feed all organic pets");
                }
                //water organic pets
                case "2" -> {
                    myShelter2.tickAllPets(pets);
                    myShelter2.tickAllPets(pets3);
                    myShelter2.showOrganicPets();
                    myShelter2.showOrganicPets();
                    myShelter.waterAllPets();
                    System.out.println("You watered all organic pets");
                }
                //Clean all dogs cages.
                case "3" -> {
                    myShelter.tickAllPets(pets);
                    myShelter.tickAllPets(pets3);
                    myShelter.showOrganicPets();
                    myShelter.cleanAllCages();
                    System.out.println("Organic Dog and Cat cage cleaned");
                }
                case "4" -> {
                    myShelter2.tickAllPets(pets);
                    myShelter2.showOrganicPets();
                    myShelter2.emptyLitterBox();
                    System.out.println();
                    System.out.println("LitterBox Cleaned ");
                    System.out.println("Litter has been replaced in cats litter box. ");
                }
                //Walk all dogs.
                case "5" -> {
                    myShelter2.tickAllPets(pets);
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
                    myShelter.tickAllPets(pets);
                    myShelter.tickAllPets(pets3);
                    myShelter.oilAllRobots();
                    System.out.println();
                    System.out.println("All robotic pets parts have been oiled ");
                }
                //Pet adoption.
                case "7" -> {
                    myShelter.tickAllPets(pets);
                    myShelter2.tickAllPets(pets3);
                    myShelter.showOrganicPets();
                    System.out.println("Would you like to adopt one of the pets? ");
                    String upForAdoptions = input.nextLine();
                    myShelter.removePet(upForAdoptions);
                    System.out.println("Pet has been adopted " + upForAdoptions);
                }
                //Add a pet.
                case "8" -> {
                    myShelter.tickAllPets(pets);
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
                    myShelter.tickAllPets(pets);
                    System.out.println("Which pet would you like to play with?");
                    System.out.println();
                    myShelter.showPetName(pets);
                    String chosenPet = input.nextLine();
                    VirtualPet playPet = myShelter.getPetNamed(chosenPet);
                    playPet.play();
                    System.out.println(chosenPet + " had a great time!");
                }
                case "10" -> {
                    myShelter.tickAllPets(pets);
                    myShelter.tickAllPets(pets2);
                    System.out.println("These are the pets in the shelter: ");
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

            myShelter.tickAllPets(pets);
        } while (myShelter.hasPets());
        // //(!myShelter.hasPets()) ;

        input.close();


    }
}
