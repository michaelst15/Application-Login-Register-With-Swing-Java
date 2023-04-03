package child;

import ex.Fish;

public class Eel extends Fish {
    protected boolean blueColor;
    protected boolean eyesOther;

    public Eel() {
        super();
        this.blueColor = true;
        this.eyesOther = false;
    }


    public String showEl() {
        return "el{blue =" + blueColor + "eyes =" + eyesOther + "animal =" + animalType + "}";
    }
}
