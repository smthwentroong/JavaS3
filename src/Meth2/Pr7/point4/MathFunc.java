package Meth2.Pr7.point4;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double x, double degree) {
        int res = 1;
        for (int i = 1; i < degree; i++) res*=x;
        return res;
    }

    @Override
    public double module(double real, double image) {
        return Math.sqrt(pow(real, 2d) + pow(image, 2d));
    }

    public double circleLength(double r) {
        return 2 * MathCalculable.PI * r;
    }
}
