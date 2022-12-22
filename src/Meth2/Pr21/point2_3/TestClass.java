package Meth2.Pr21.point2_3;

public class TestClass {
    public static void main(String[] args) {
        UniArray<Object> ints = new UniArray<>(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("Integers arr: " + ints.getUniarrVal(4));
        ints = new UniArray<>(new Double[]{1.7d, 2.5d, 7d, 32d, 77.7d});
        System.out.println("Doubles arr: " + ints.getUniarrVal(4));
    }
}
