package Lab4;

public class Car implements Priceable{
    int price;

    public Car(int p) {
        price = p;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
