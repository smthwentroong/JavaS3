package Lab4;

public class TestInterface {
    public static void main(String[] args) {
        Priceable h1 = new House(30000);
        Priceable c1 = new Car(5000);

        System.out.println("Стоимость дома " + h1.getPrice());
        System.out.println("Стоимость машины " + c1.getPrice());
    }
}
