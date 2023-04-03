package Composisi;

import Composisi.Component.GraphicsCard;
import Composisi.Component.Processor;
import Composisi.Perangkat.Laptop;

public class Test {
    public static void main(String[] args) {
        Processor process = new Processor("ASUS", "FOX", 4, 6);
        GraphicsCard gc = new GraphicsCard("FR", 3, "12GB");
        Laptop View = new Laptop("CINE", process, gc, "FG", "DE", "RT", "DE");

        System.out.println(View);
    }
}
