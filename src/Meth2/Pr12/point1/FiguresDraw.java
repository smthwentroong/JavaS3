package Meth2.Pr12.point1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.util.Random;

class RGB {
    int red;
    int green;
    int blue;
    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}
class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

abstract class Shape {
    RGB color;
    Point center;
    public Shape(int red, int green, int blue, int x, int y) {
        this.color = new RGB(red, green, blue);
        this.center = new Point(x, y);
    }
    public abstract void drawShape(Graphics g);
}

class Circle extends Shape {
    int d;
    public Circle(int red, int green, int blue, int x, int y, int d) {
        super(red, green, blue, x, y);
        this.d = d;
    }
    public void drawShape(Graphics g){
        Graphics2D gr2D = (Graphics2D) g;
        Ellipse2D.Double shape = new Ellipse2D.Double(center.x, center.y, d, d);
        gr2D.setColor(new Color(color.red, color.green, color.blue));
        gr2D.fill(shape);
    }
}

class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int red, int green, int blue, int x, int y, int width, int height) {
        super(red, green, blue, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawShape(Graphics g) {
        Graphics2D gr2D = (Graphics2D) g;
        Rectangle2D.Double shape = new Rectangle2D.Double(center.x, center.y, width, height);
        gr2D.setColor(new Color(color.red, color.green, color.blue));
        gr2D.fill(shape);
    }
}

class Triangle extends Shape {
    Point A;
    Point B;
    Point C;
    private Random rnd = new Random();
    public Triangle(int red, int green, int blue, int x, int y) {
        super(red, green, blue, x, y);
        this.A = new Point(x + rnd.nextInt(-150, 150), y + rnd.nextInt(-150, 150));
        this.B = new Point(x + rnd.nextInt(-150, 150), y + rnd.nextInt(-150, 150));
        this.C = new Point(x + rnd.nextInt(-150, 150), y + rnd.nextInt(-150, 150));
    }

    @Override
    public void drawShape(Graphics g) {
        int X[] = {A.x, B.x, C.x};
        int Y[] = {A.y, B.y, C.y};

        Graphics2D gr2D = (Graphics2D) g;
        GeneralPath shape = new GeneralPath();
        shape.moveTo(X[0] + center.x, Y[0] + center.y);

        for(int i = 1; i < 3; i++) {
            shape.lineTo(X[0] + center.x, Y[0] + center.y);
        }

        shape.closePath();

        gr2D.setColor(new Color(color.red, color.green, color.blue));
        gr2D.fill(shape);
    }
}

public class FiguresDraw extends JPanel {
    private static Random rnd = new Random();
    public FiguresDraw() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(600, 600));
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);


        int shape;
        for (int i = 0; i < 20; i++) {
            shape = rnd.nextInt(3);
            if (shape == 0) {
                Circle circle = new Circle(rnd.nextInt(256),
                        rnd.nextInt(256),rnd.nextInt(256),
                        rnd.nextInt(500), rnd.nextInt(500),
                        rnd.nextInt(150));
                circle.drawShape(g);
            }
            else if (shape == 1) {
                Rectangle rect = new Rectangle(rnd.nextInt(256),
                        rnd.nextInt(256),rnd.nextInt(256),
                        rnd.nextInt(500),rnd.nextInt(500),
                        rnd.nextInt(75),rnd.nextInt(75));
                rect.drawShape(g);
            }
            else {
                Triangle tri = new Triangle(rnd.nextInt(256),
                        rnd.nextInt(256),rnd.nextInt(256),
                        rnd.nextInt(500),rnd.nextInt(500));
                tri.drawShape(g);
            }
        }
    }

    public static  void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new FiguresDraw());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
