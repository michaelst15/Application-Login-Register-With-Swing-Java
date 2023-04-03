package ex;

import ex.Animal;

public class Reptile extends Animal {
    protected String name;
    protected int weight;

    public Reptile() {
        heihtInFeet = 23;
        weightInKilos = 21;
        animalType = "crocodile";
        blooodType = "red";
        this.name = "";
        this.weight =  23;
    }


    public String Info() {
        return "Reptile{" +
                "heihtInFeet=" + heihtInFeet +
                "weightInKilos " + weightInKilos +
                "animalType " + animalType +
                "bloodType " + blooodType +
                '}';
    }
}
