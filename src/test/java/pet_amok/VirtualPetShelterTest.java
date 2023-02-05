package pet_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    pet_amok.VirtualPetShelter underTest;
    pet_amok.VirtualPet pet1;
    pet_amok.VirtualPet pet2;
    pet_amok.VirtualPet pet3;
    pet_amok.VirtualPet pet4;

    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Oscar","Dog - Big",100,100,1000, 100, 34,44, 32);
        pet2 = new VirtualPet("Phoebe","Dog - Small",75,75,75,75, 41, 20, 13);
        pet3 = new VirtualPet("Sam","Cat - Big", 50, 50,50,50, 25, 31, 16);
        pet4 = new VirtualPet("Kitten", "Cat - Small",25, 25,25,25, 35, 52,30);
//
//    }
//
//    @Test
//    public void shouldFindPet(){
//        underTest.addPet(pet1);
//        VirtualPet retrievedPet = underTest.findPet("Oscar");
//        assertEquals(retrievedPet, pet1);
//
//    }
//
//    @Test
//    public void shouldAddTwoPets(){
//        underTest.addPet(pet1);
//        underTest.addPet(pet2);
//        Collection<pet_amok.VirtualPet> allPets = underTest.getAllPets();
//        assertEquals(allPets, containsInAnyOrder(pet1,pet2));
//    }
//    @Test
//    public void shouldAddThreePets(){
//        underTest.addPet(pet1);
//        underTest.addPet(pet2);
//        underTest.addPet(pet3);
//        Collection<pet_amok.VirtualPet> allPets = underTest.getAllPets();
//        assertEquals(allPets, containsInAnyOrder(pet1,pet2,pet3));
//    }
//    @Test
//    public void shouldAddFourPets(){
//        underTest.addPet(pet1);
//        underTest.addPet(pet2);
//        underTest.addPet(pet3);
//        underTest.addPet(pet4);
//        Collection<pet_amok.VirtualPet> allPets = underTest.getAllPets();
//        assertEquals(allPets, containsInAnyOrder(pet1,pet2,pet3,pet4));
//    }
//    @Test
//    public void shouldBeAbleToAdoptOrRemovePet(){
//        underTest.adopt();
//        pet_amok.VirtualPet retrievePet = underTest.findPet(" ");
//        assertEquals(retrievePet,"");
    }

}
