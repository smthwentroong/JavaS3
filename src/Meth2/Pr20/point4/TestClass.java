package Meth2.Pr20.point4;

public class TestClass {
    public static void main(String[] args) {
        Integer arr[] = {1, 3, 9, 5 ,7, 0, 8};
        MinMax<Integer> Arr = new MinMax<>(arr);
        System.out.println("Min: " + Arr.min());
        System.out.println("Max: " + Arr.max());

        System.out.println("25,7 + 17 = " + NotGenericCalculator.sum(25.7d, 17));

        System.out.println("25 - 17 = " + NotGenericCalculator.sub(25.7d, 17));

        System.out.println("25 * 17 = " + NotGenericCalculator.mlp(25.7d, 17));

        System.out.println("25 / 17 = " + NotGenericCalculator.div(25.7d, 17));
    }
}
