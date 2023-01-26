package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet("Oscar", 10, 10, 10, 10);

        System.out.println("Hello my friend!");
        System.out.println("Welcome to your favorite pet in the world " + myVirtualPet.petName);
        System.out.println("");
        System.out.println("Pet Name: " + myVirtualPet.petName);
        System.out.println("Hunger: " + myVirtualPet.hunger);
        System.out.println("Thirst: " + myVirtualPet.thirst);
        System.out.println("Boredom: " + myVirtualPet.boredom);
        System.out.println("Tiredness: " + myVirtualPet.tiredness);
        System.out.println("");
        System.out.println("Make a selection 1 through 5 to find out how " + myVirtualPet.petName + " is doing today");
        System.out.println("");
        System.out.println("Please select from the menu below");
        System.out.println("1) To Feed " + myVirtualPet.petName);
        System.out.println("2) To Give Water To " + myVirtualPet.petName);
        System.out.println("3) To Play With " + myVirtualPet.petName);
        System.out.println("4) Bed Time For " + myVirtualPet.petName);
        System.out.println("5) To Exit");

        String userChoice = input.nextLine();
        while (!userChoice.equals("5")) {

            if (userChoice.equals("1")) {
                System.out.println("You Feed " + myVirtualPet.petName);

                myVirtualPet.feedPet(-5);
                myVirtualPet.waterPet(1);
                myVirtualPet.playWithPet(3);
                myVirtualPet.restPet(6);

                System.out.println(myVirtualPet.petName + " Hunger is: " + myVirtualPet.getHunger());
                System.out.println(myVirtualPet.petName + " Thirst is: " + myVirtualPet.getThirst());
                System.out.println(myVirtualPet.petName + " Boredom is: " + myVirtualPet.getBoredom());
                System.out.println(myVirtualPet.petName + " Tiredness is: " + myVirtualPet.getTiredness());
                System.out.println("");
                System.out.println("To continue make another selection");
                System.out.println("");
                System.out.println("1) To Feed " + myVirtualPet.petName);
                System.out.println("2) To Give Water To " + myVirtualPet.petName);
                System.out.println("3) To Play With " + myVirtualPet.petName);
                System.out.println("4) Bed Time For " + myVirtualPet.petName);
                System.out.println("5) To Exit");

            } else if (userChoice.equals("2")) {
                System.out.println("You Gave Water To  " + myVirtualPet.petName);

                myVirtualPet.feedPet(0);
                myVirtualPet.waterPet(-5);
                myVirtualPet.playWithPet(2);
                myVirtualPet.restPet(0);

                System.out.println(myVirtualPet.petName + " Hunger is: " + myVirtualPet.getHunger());
                System.out.println(myVirtualPet.petName + " Thirst is: " + myVirtualPet.getThirst());
                System.out.println(myVirtualPet.petName + " Boredom is: " + myVirtualPet.getBoredom());
                System.out.println(myVirtualPet.petName + " Tiredness is: " + myVirtualPet.getTiredness());

                System.out.println("");
                System.out.println("To continue make another selection");
                System.out.println("");
                System.out.println("1) To Feed " + myVirtualPet.petName);
                System.out.println("2) To Give Water To " + myVirtualPet.petName);
                System.out.println("3) To Play With " + myVirtualPet.petName);
                System.out.println("4) Bed Time For " + myVirtualPet.petName);
                System.out.println("5) To Exit");

            }

            else if (userChoice.equals("3")) {
                System.out.println("Play with  " + myVirtualPet.petName);

                myVirtualPet.feedPet(10);
                myVirtualPet.waterPet(5);
                myVirtualPet.playWithPet(-7);
                myVirtualPet.restPet(10);

                System.out.println(myVirtualPet.petName + " Hunger is: " + myVirtualPet.getHunger());
                System.out.println(myVirtualPet.petName + " Thirst is: " + myVirtualPet.getThirst());
                System.out.println(myVirtualPet.petName + " Boredom is: " + myVirtualPet.getBoredom());
                System.out.println(myVirtualPet.petName + " Tiredness is: " + myVirtualPet.getTiredness());
                System.out.println("");
                System.out.println("To continue make another selection");
                System.out.println("");
                System.out.println("1) To Feed " + myVirtualPet.petName);
                System.out.println("2) To Give Water To " + myVirtualPet.petName);
                System.out.println("3) To Play With " + myVirtualPet.petName);
                System.out.println("4) Bed Time For " + myVirtualPet.petName);
                System.out.println("5) To Exit");
            }


            else if (userChoice.equals("4")) {
                System.out.println("BedTime For  " + myVirtualPet.petName);

                myVirtualPet.feedPet(0);
                myVirtualPet.waterPet(0);
                myVirtualPet.playWithPet(0);
                myVirtualPet.restPet(-8);

                System.out.println(myVirtualPet.petName + " Hunger is: " + myVirtualPet.getHunger());
                System.out.println(myVirtualPet.petName + " Thirst is: " + myVirtualPet.getThirst());
                System.out.println(myVirtualPet.petName + " Boredom is: " + myVirtualPet.getBoredom());
                System.out.println(myVirtualPet.petName + " Tiredness is: " + myVirtualPet.getTiredness());
                System.out.println("");
                System.out.println("To continue make another selection");
                System.out.println("");
                System.out.println("1) To Feed " + myVirtualPet.petName);
                System.out.println("2) To Give Water To " + myVirtualPet.petName);
                System.out.println("3) To Play With " + myVirtualPet.petName);
                System.out.println("4) Bed Time For " + myVirtualPet.petName);
                System.out.println("5) To Exit");
            }
            else {
                System.out.println("Error! Select 1-5");
            }
            userChoice = input.nextLine();
        }
    }
}
