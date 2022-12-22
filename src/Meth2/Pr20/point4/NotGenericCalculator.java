package Meth2.Pr20.point4;

public class NotGenericCalculator {
    public static <F extends Number, S extends Number> Double sum(F f, S s) {
        return f.doubleValue() + s.doubleValue();
    }

    public static <F extends Number, S extends Number> Double sub(F f, S s) {
        return f.doubleValue() - s.doubleValue();
    }

    public static <F extends Number, S extends Number> Double mlp(F f, S s) {
        return f.doubleValue() * s.doubleValue();
    }

    public static <F extends Number, S extends Number> Double div(F f, S s) {
        return f.doubleValue() / s.doubleValue();
    }
}
