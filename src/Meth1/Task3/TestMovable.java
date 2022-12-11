package Meth1.Task3;

public class TestMovable {
    public static void main(String[] args) {

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
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
