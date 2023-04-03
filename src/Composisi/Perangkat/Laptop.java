package Composisi.Perangkat;

import Composisi.Component.GraphicsCard;
import Composisi.Component.Processor;

public class Laptop {
    private String screen;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private String ram;
    private String hardDrive;
    private String opticalDrive;
    private String keyboard;

    public Laptop() {
        this.screen = "12 Screen";
        this.processor = new Processor();
        this.graphicsCard = new GraphicsCard();
        this.ram = "12GB";
        this.hardDrive = "SSD";
        this.opticalDrive = "PION";
        this.keyboard = "GL-I";
    }

    public Laptop(
            String screen,
            Processor processor,
            GraphicsCard graphicsCard,
            String ram,
            String hardDrive,
            String opticalDrive,
            String keyboard
    ) {
        this.screen = screen;
        this.processor = new Processor();
        this.graphicsCard = new GraphicsCard();
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop { screen = " + screen + " processor = " + processor + " graphicsCard = " + graphicsCard
               + " ram = " + ram + " hardDrive = " + hardDrive + " opticalDrive = " + opticalDrive +
                " keyboard = " + keyboard +
        "}";
    }

    public Processor getProcessor() {
        return processor;
    }


    public static  void main(String[] args) {
        Laptop l = new Laptop();
        System.out.println(l.getProcessor().getBrand());
    }
}
