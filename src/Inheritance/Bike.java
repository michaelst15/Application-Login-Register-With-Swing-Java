package Inheritance;

import Generic.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle = "dr";
    }


    public Bike(String handle, String engine, int wheels, int seats, int fueltank, String lights) {
        super( engine, wheels, seats, fueltank, lights);
        this.handle = handle;
    }



    public String getHandle() {

        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "getHandle()" + getHandle() + "getEngine()" + getEngine() +
                "getLights()" + getLights() + "getWheels()" + getWheels() +
                "getSeats()" + getSeats() + "getFuelTank()" + getFuelTank() +
                "}";
    }


    public void run() {
        System.out.println("run");
        System.out.println(toString());
    }
}
