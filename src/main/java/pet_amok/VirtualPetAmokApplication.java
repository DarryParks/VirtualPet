package pet_amok;

import java.util.Scanner;

public class VirtualPetAmokApplication {
    public static void main(String[] args) {

        VirtualPet pets = new OrganicDog("Oscar", 10, 10, 10, 10, 0);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.addPet(pets);

        VirtualRoboticPet pets2 = new RoboticDog("Wrigley ", 10, 10, 0,10);
        VirtualPetShelter myRoboticShelter = new VirtualPetShelter();
        myRoboticShelter.addRoboticPet(pets2);

        VirtualPet pets3 = new OrganicCat("Raymond ", 5, 5, 5, 5, 5) {
            @Override
            public void walk() {

            }
        };
        VirtualPetShelter myShelter2 = new VirtualPetShelter();
        myShelter2.addPet(pets3);
        myShelter2.addPet(pets3);

        VirtualRoboticPet pets4 = new RoboticCat("Whiskers ", 10, 10, 10,0);
        VirtualPetShelter myRoboticShelter2 = new VirtualPetShelter();
        myRoboticShelter2.addRoboticPet(pets4);

        Scanner input = new Scanner(System.in);
        System.out.println("Playful pets looking for parents");

        String showMenu = "\n\t	Please choose an option: \n" + "\n\t" + "  1. Feed organic pets\n\t"
                + "  2. Water organic pets\n\t" + "  3. Clean the dog cages.\n\t" + "  4. Clean the litter box.\n\t"
                + "  5. Walk the dogs.\n\t" + "  6. Oil Robotic Pets. \n\t" + "  7. Adopt a pet\n\t"
                + "  8. Admit a pet\n\t" + "  9. Play with a pet \n\t" + " 10. Show pets in shelter\n\t" + " 11. Quit";

        String userChoice;
        // while (myShelter.hasPets()) {
        do {
            System.out.println(showMenu);
            userChoice = input.nextLine();
            switch (userChoice) {
                //feeding all organic animals.
                case "1":
                    myShelter.tickAllPets(pets);
                    myShelter.feedPets();
                    System.out.println("You feed all organic pets");
                    break;
                //water organic pets
                case "2":
                    myShelter.tickAllPets(pets);
                    myShelter.waterAllPets();
                    System.out.println("You watered all organic pets");
                    break;
                //Clean all dogs cages.
                case "4":
                    myShelter.tickAllPets(pets);
                    myShelter.cleanAllCages();
                    System.out.println("Litter has been replace in all cats litter box.");
                    //Walk all dogs.
                case "5":
                    myShelter.tickAllPets(pets);
                    myShelter.walkDogs();
                    System.out.println("All dogs are being have been walked");
                    break;
                //Oil all Robotic Pets
                case "6":
                    myShelter.tickAllPets(pets);
                    myShelter.oilAllRobots();
                    System.out.println("All robotic pets parts have been oiled ");
                    //Pet adoption.
                case "7":
                    myShelter.tickAllPets(pets);
                    myShelter.showAllPets(pets);
                    System.out.println("Would you like to adopt one of the pets? ");
                    String upForAdoptions = input.nextLine();
                    myShelter.removePet(upForAdoptions);
                    System.out.println("Pet has been adopted" + upForAdoptions);
                    break;
                //Add a pet.
                case "8":
                    myShelter.tickAllPets(pets);
                    System.out.println(
                            "Do you have a: \n\t A. Organic Dog \n\t B. Organic Cat \n\t C. Robotic Dog \n\t D. Robotic Cat");
                    String petType = input.nextLine();
                    switch (petType.toUpperCase()) {
                        // Add organic dog.
                        case "A":
                            System.out.println("Name the Dog");
                            String organicDogName = input.nextLine();
                            VirtualPet newOrganicDog = new OrganicCat(organicDogName, 10, 10, 10, 10, 10) {
                                @Override
                                public void walk() {

                                }
                            };
                            myShelter.addPet(newOrganicDog);
                            break;

                        // Add organic cat.
                        case "B":
                            System.out.println("Please name the new cat: ");
                            String organicCatName = input.nextLine();
                            VirtualPet newOrganicCat = new OrganicCat(organicCatName, 10, 10, 0, 0, 0) {
                                @Override
                                public void walk() {

                                }
                            };
                            myShelter.addPet(newOrganicCat);
                            break;
                        // Add robotic dog.
                        case "C":
                            System.out.println("Please name the new robotic dog: ");
                            String roboticDogName = input.nextLine();
                            VirtualRoboticPet newRoboticDog = new RoboticDog(roboticDogName, 10, 10,0,10);
                            myRoboticShelter.addRoboticPet(newRoboticDog);
                            break;
                        // Add robotic cat.
                        case "D":
                            System.out.println("Please name the new robotic cat: ");
                            String roboticCatName = input.nextLine();
                            VirtualRoboticPet newRoboticCat = new RoboticCat(roboticCatName, 10, 10, 10,10);
                            myRoboticShelter.addRoboticPet(newRoboticCat);
                            break;
                    }
                    System.out.println("Congratulations! You've got a new pet!");
                    break;

                // play wit pet
                case "9":

                    myShelter.tickAllPets(pets);
                    System.out.println("Which pet would you like to play with?");
                    System.out.println();
                    myShelter.showPetName(pets);
                    String chosenPet = input.nextLine();
                    VirtualPet playPet = myShelter.getPetNamed(chosenPet);
                    playPet.play();
                    System.out.println(chosenPet + " had a great time!");
                    break;
                case "10":
                    myShelter.tickAllPets(pets);
                    System.out.println("These are the pets in the shelter: ");

                    myShelter.showAllPets(pets);

                    myRoboticShelter.showAllRoboticPets(pets2);

                    myShelter2.showAllPets(pets3);
                    myRoboticShelter2.showAllRoboticPets(pets4);

                    // System.out.println(myShelter.showAllPets(playPet);
                    break;
                case "11":
                    System.out.println("See you next time!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("error, Try again.");


            }

            myShelter.tickAllPets(pets);
        }while (myShelter.hasPets());
        // //(!myShelter.hasPets()) ;

        input.close();


    }}
