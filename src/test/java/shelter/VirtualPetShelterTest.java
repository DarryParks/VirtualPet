package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    shelter.VirtualPetShelter underTest;
    shelter.VirtualPet pet1;
    shelter.VirtualPet pet2;
    shelter.VirtualPet pet3;
    shelter.VirtualPet pet4;

    @BeforeEach
    public void setUp(){
        underTest = new shelter.VirtualPetShelter();
        pet1 = new shelter.VirtualPet("Oscar","Dog - Big",100,100,1000, 100);
        pet2 = new shelter.VirtualPet("Phoebe","Dog - Small",75,75,75,75);
        pet3 = new shelter.VirtualPet("Sam","Cat - Big", 50, 50,50,50);
        pet4 = new shelter.VirtualPet("Kitten", "Cat - Small",25, 25,25,25);

    }

    @Test
    public void shouldFindPet(){
        underTest.addPet(pet1);
        shelter.VirtualPet retrievedPet = underTest.findPet("Oscar");
        assertEquals(retrievedPet, pet1);

    }

    @Test
    public void shouldAddTwoPets(){
        underTest.addPet(pet1);
        underTest.addPet(pet2);
        Collection<shelter.VirtualPet> allPets = underTest.getAllPets();
        assertEquals(allPets, containsInAnyOrder(pet1,pet2));
    }
    @Test
    public void shouldAddThreePets(){
        underTest.addPet(pet1);
        underTest.addPet(pet2);
        underTest.addPet(pet3);
        Collection<shelter.VirtualPet> allPets = underTest.getAllPets();
        assertEquals(allPets, containsInAnyOrder(pet1,pet2,pet3));
    }
    @Test
    public void shouldAddFourPets(){
        underTest.addPet(pet1);
        underTest.addPet(pet2);
        underTest.addPet(pet3);
        underTest.addPet(pet4);
        Collection<shelter.VirtualPet> allPets = underTest.getAllPets();
        assertEquals(allPets, containsInAnyOrder(pet1,pet2,pet3,pet4));
    }
    @Test
    public void shouldBeAbleToRemovePet(){
        underTest.adopt(pet1);
        shelter.VirtualPet retrievePet = underTest.findPet("Oscar");
        assertEquals(retrievePet,null);
    }

}
