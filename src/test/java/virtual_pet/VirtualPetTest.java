package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {


    @Test
    public void shouldHaveValue50(){
        VirtualPet underTest = new VirtualPet("Oscar", 50, 100, 75, 65 );
        assertEquals(50, underTest.getHunger());
    }
    @Test
    public void shouldHaveValue100(){
        VirtualPet underTest = new VirtualPet("Oscar", 50, 100, 75, 65 );
        int thirst = underTest.getThirst();
        assertEquals(100,thirst);
    }
    @Test
    public void shouldHaveValue75(){
        VirtualPet underTest = new VirtualPet("Oscar", 50, 100, 75, 65 );
        int boredom = underTest.getBoredom();
        assertEquals(75,boredom);
    }
    @Test
    public void shouldHaveValue65(){
        VirtualPet underTest = new VirtualPet("Oscar", 50, 100, 75, 65 );
        int tiredness = underTest.getTiredness();
        assertEquals( 65, tiredness);
    }

    @Test
    public void feedingPets(){
        VirtualPet pet = new VirtualPet("Oscar", 50, 100, 75, 65 );
        pet.feedPet(45);
        assertEquals(95, pet.getHunger());
    }





    //@Test
    //public void shouldHaveAValueOf100(){
    //int thirst = underTest.getThirst();
    //assertEquals(100, thirst);
}