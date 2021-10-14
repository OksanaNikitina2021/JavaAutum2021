package sef.module17.activity;

import java.util.ArrayList;

public class Animals {

    /*1) In file Animals
    1.1) Create file Animals from scratch
    1.2) Implement private attributes :
    ArrayList<String> species = new ArrayList<>();
    String color
    1.3) Create setters and getters for color
    1.4) Create constructor for class Animals in which 3 animals are added to array list,
    animals added to list should be "Dog", "Cat", "Mouse"
    1.5) Create a method with name "getColorAndSpecies" which will return text like:
            "Animals species is: " + species + " and its color is: " + color;
    1.6) Create a setter and getter for species*/

    //1.2
    private ArrayList<String> species = new ArrayList<>();
    private String color;

    public Animals() {
        species.add("Dog");
        species.add("Cat");
        species.add("Mouse");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species) {
        this.species.add(species);
    }

    public String getSpecies(int index) {
        return species.get(index);
    }

    public String getColorAndSpecies(String color, int index) {
        return "Animals species is: " + this.species.get(index) + " and color is: " + color;
    }

    public ArrayList<String> getSpecies() {
        return species;
    }
}
