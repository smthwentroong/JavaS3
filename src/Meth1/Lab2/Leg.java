package Meth1.Lab2;

public class Leg {
    private String side;
    private boolean stepped;

    public Leg(String side) {
        this.side = side;
        stepped = false;
    }

    public void setStepped(boolean stepped) {
        this.stepped = stepped;
    }

    public boolean getStepped() {
        return stepped;
    }

    public String step(String surfaceType) {
        if (stepped == false && surfaceType != "danger") {
            this.stepped = true;
            return "Шагнули";
        }
        return "Опасно наступать";
    }
}
