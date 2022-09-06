package Task3;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "red";
        radius = 1;
    }
    public Circle(double radius) {
        this.filled = false;
        this.color = "red";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void stupid() {
        System.out.println("shit");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: "
                + this.color + "\narea: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
