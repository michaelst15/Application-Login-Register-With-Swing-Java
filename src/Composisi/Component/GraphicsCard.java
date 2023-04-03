package Composisi.Component;

public class GraphicsCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicsCard() {
        this.brand = "GX";
        this.memory = "15GB";
        this.series = 7;
    }

    public GraphicsCard(String brand, int series, String memory) {
        this.brand = brand;
        this.memory = memory;
        this.series = series;
    }
}
