package ex;

public class Animal {
    protected float heihtInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String blooodType;

    public Animal() {
        this.animalType = "unknown";
        this.heihtInFeet = 21;
        this.weightInKilos = 12;
        this.blooodType = "unknown";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "heihtInFeet=" + heihtInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", blooodType='" + blooodType + '\'' +
                '}';
    }
}
