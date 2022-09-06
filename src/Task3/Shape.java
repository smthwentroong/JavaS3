package Task3;
import java.math.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = false;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        this.color = c;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean f) {
        this.filled = f;
    }

    //Абстрактные методы
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
