package Meth2.Pr6.point6_11.BookShop;

public class Magazine implements Printable{
    int num;
    Magazine(int num) {
        this.num = num;
    }
    @Override
    public void print() {
        System.out.printf("Omg! This is a %d magazine!\n", num);
    }
}
