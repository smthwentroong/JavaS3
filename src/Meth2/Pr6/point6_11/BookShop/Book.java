package Meth2.Pr6.point6_11.BookShop;

public class Book implements Printable{
    int num;
    Book(int num) {
        this.num = num;
    }
    @Override
    public void print() {
        System.out.printf("This is a %d book! Wow!\n", num);
    }
}
