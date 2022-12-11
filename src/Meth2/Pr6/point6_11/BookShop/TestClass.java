package Meth2.Pr6.point6_11.BookShop;

public class TestClass {
    public static void main(String[] args) {
        Printable printables[] = new Printable[10];
        int books = 0;
        int magazines = 0;
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                books++;
                printables[i] = new Book(books);
            }
            else {
                magazines++;
                printables[i] = new Magazine(magazines);
            }
        }
        for (int i = 0; i < 10; i++) {
            printables[i].print();
        }
    }
}

