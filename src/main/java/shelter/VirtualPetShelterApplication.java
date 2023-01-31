package shelter;

import java.util.Scanner;

public class VirtualPetShelterApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myPet = new VirtualPetShelter();
//        shelter.VirtualPet pet1 = new shelter.VirtualPet("Oscar", "Dog-Big", 50, 50, 50, 50);
//        shelter.VirtualPet pet2 = new shelter.VirtualPet("Phoebe", "Dog-Small", 75, 70, 100, 25);
//        shelter.VirtualPet pet3 = new shelter.VirtualPet("Sam", "Cat-Big", 30, 100, 45, 20);
//        shelter.VirtualPet pet4 = new shelter.VirtualPet("Kitten", "Cat-Small", 50, 60, 30, 70);
//
//        myPet.addPet(pet1);
//        myPet.addPet(pet2);
//        myPet.addPet(pet3);
//        myPet.addPet(pet4);

        String userChoice;
        boolean run = true;


            System.out.println("WELCOME TO VIRTUAL PET!");
            System.out.println("These are the pets in the Shelter");
            System.out.println();

          while (run) {

              System.out.println();
              System.out.println("Choose an option");
              System.out.println("Press 1 Feed all pets");
              System.out.println("Press 2 Water all pets");
              System.out.println("Press 3 Play with pet");
              System.out.println("Press 4 Rest pet");
              System.out.println("Press 5 add pet to shelter");
              System.out.println("Press 6 would you like to adopt a pet from shelter");
              System.out.println("Press 7 show all pets");
              System.out.println("Press 8 Exit");
              userChoice = input.nextLine();

              if (userChoice.equals("1")) {
                  myPet.feedAllPets();
                  myPet.showPets();
              }

              if (userChoice.equals("2")) {
                  myPet.waterAllPets();
                  myPet.showPets();
              }

              if (userChoice.equals("3")) {
                  myPet.playWithAllPets();
                  myPet.showPets();

              }

              if (userChoice.equals("4")) {
                  myPet.restAllPets();
                  myPet.showPets();
              }

              if (userChoice.equals("5")) {
                  System.out.println("Enter Pet name to remove");
                  String name = input.nextLine();
                  myPet.adopt(name);
                  myPet.showPets();
              }


              if (userChoice.equals("8")) {
                  run = false;

              }
          }



        }







    }


