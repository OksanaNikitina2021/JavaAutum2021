package sef.module17.activity;

import junit.framework.TestCase;

public class AnimalsTest extends TestCase {
    /*2) MyAnimalTest class
    2.1) Create a new MyAnimalTest class
    2.2) Add private attribute animals
    2.3) Create a setUp method which will initialize Animals
    2.4) Create 3 tests which will validate exact text of "getColorAndSpecies" method returned is as expected. Colors used can be of your choice.
    2.5) Create a test where you add a species to List and validate that the species has been added
    to the list*/

    private Animals animals;
    private String expectedText = "Animals species is: %s and color is: %s";

    protected void setUp() throws Exception {
        super.setUp();
        animals = new Animals();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testBlackDogAnimal() {
        animals.setColor("black");
        assertEquals(String.format(expectedText, "Dog", "black"), animals.getColorAndSpecies("black", 0));

    }

    public void testWhiteCatAnimal() {
        animals.setColor("white");
        assertEquals(String.format(expectedText, "Cat", "white"), animals.getColorAndSpecies("white", 1));
    }

    public void testGreyMouseAnimal() {
        animals.setColor("grey");
        assertEquals(String.format(expectedText, "Mouse", "grey"), animals.getColorAndSpecies("grey", 2));
    }

    public void testAddSpecies(){
        animals.setSpecies("babby shark");
        int sizeOfAnimals = animals.getSpecies().size();
        assertEquals("babby shark", animals.getSpecies(sizeOfAnimals - 1));
    }
}
