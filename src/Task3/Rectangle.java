package Task3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
        this.filled = false;
        this.color = "red";
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "red";
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        this.width = w;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " +
                this.length +", color: " + this.color +
                "\narea: " + getArea() + "perimeter: " + getPerimeter();
    }
}
