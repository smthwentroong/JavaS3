package Meth1.Task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author auth = new Author("Evpatiy Mironov", "???", 'M');
        System.out.println(auth);
        auth.setEmail("MirEvp@gmail.com");
        System.out.println(auth);
    }
}
