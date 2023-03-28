package Inheritance;

public class Kucing  extends Hewan{

    private String ras;
    private String habitat;
    public  Kucing(String ras, String habitat) {
        super();
        System.out.println("construct kucing");
    }

    @Override
    public  String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public void makan() {
        System.out.println("Kucing sedang makan");
    }

    public void makan(String food) {
        System.out.println("Kucing makan " + food);
    }
}
