package Meth2.Pr7.point7_9;

public class Book implements Printable {
    int num;
    Book(int num) {
        this.num = num;
    }
    @Override
    public void print() {
        System.out.printf("This is a %d book! Wow!\n", num);
    }
}
