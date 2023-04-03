package Generic;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle() {
        this.engine = "petrol";
        this.lights = "LED";
        this.fuelTank = 23;
        this.seats = 2;
        this.wheels = 12;
    }

    public Vehicle(String engine) {

        this.engine = engine;
    }

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
        this.wheels = wheels;
        this.seats = seats;
        this.lights = lights;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }

}

