package Task3;

public class Square extends Rectangle{

    public Square() {
        this.width = 1;
        this.length = 1;
        this.filled = false;
        this.color = "red";
    }
    public Square(double side) {
        this.filled = false;
        this.color = "red";
        this.length = side;
        this.width = side;
    }
    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.length;
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: Square, side: " + this.length + ", color: " + this.color +
                "\narea: " + getArea() + "perimeter: " + getPerimeter();
    }
}
