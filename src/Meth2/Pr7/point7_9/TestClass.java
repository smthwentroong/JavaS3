package Meth2.Pr7.point7_9;

public class TestClass {
    public static void printMagazines(Printable printable) {
        if (printable instanceof Magazine) {
            printable.print();
        }
    }

    public static void printBooks(Printable printable) {
        if (printable instanceof Book) {
            printable.print();
        }
    }

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

        System.out.println("Только журналы");
        for (int i = 0; i < 10; i++) {
            printMagazines(printables[i]);
        }

        System.out.println("Только книги");
        for (int i = 0; i < 10; i++) {
            printBooks(printables[i]);
        }
    }
}

