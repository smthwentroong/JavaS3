package Meth2.Pr6.point6_11.CompShop;

public class TestClass {
    public static void main(String[] args) {
        Shop shop = new Shop(10);
        System.out.println(shop);
        shop.addComputer(new Computer(ComputerMarks.Expensive,
                new Monitor("Some Monitor", 1920, 1080),
                new Processor("INTEL", 3100, 8),
                new Memory("Crucial Ballistix", 3600, 16),
                100000));
        System.out.println(shop);
        shop.removeComputer(7);
        System.out.println(shop);
        System.out.println(shop.searchComputer(ComputerMarks.Expensive.getName()));
    }
}
