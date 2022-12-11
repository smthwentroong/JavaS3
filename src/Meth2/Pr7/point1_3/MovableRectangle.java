package Meth2.Pr7.point1_3;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean SpeedTest() {
        if (topLeft.xSpeed == bottomRight.xSpeed &&
        topLeft.ySpeed == bottomRight.ySpeed) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Shape: Rectangle, topLeftPosX: " + topLeft.x +
                ", topLeftPosY: " + topLeft.y +
                ", bottomRightPosX: " + bottomRight.x +
                ", bottomRightPosY: " + bottomRight.y;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}
