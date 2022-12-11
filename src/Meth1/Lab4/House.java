package Meth1.Lab4;

public class House implements Priceable{
    int price;

    public House(int p) {
        price = p;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
