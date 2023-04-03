package Composisi.Component;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;

    public Processor() {
        this.brand = "GLX";
        this.generation = 5;
        this.cores = 7;
        this.series = "think";
    }

    public Processor(String brand, String series, int generation, int cores) {
        this.brand = brand;
        this.generation = generation;
        this.cores = cores;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }
}
