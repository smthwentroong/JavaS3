package Meth2.Pr6.point1;

import Meth1.Task3.MovableCircle;
import Meth1.Task3.MovableRectangle;

public class TestMovable {
    public static void main(String[] args) {

        Meth1.Task3.MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        MovableRectangle rect = new MovableRectangle(-1, 1, 1, -1, 1, 1);

        //Кружочек
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);

        //Четырехугольник
        System.out.println(rect);
        rect.moveUp();
        rect.moveLeft();
        System.out.println(rect);

    }
}
