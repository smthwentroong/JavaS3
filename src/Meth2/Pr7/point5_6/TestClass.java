package Meth2.Pr7.point5_6;

public class TestClass {
    public static void main(String[] args) {
        ProcessStrings processor = new ProcessStrings();
        System.out.println("Строка: sagasfsklghjrihg");
        System.out.println(processor.getLength("sagasfsklghjrihg"));
        System.out.println("Строка: nikita");
        System.out.println(processor.unevenChars("nikita"));
        System.out.println("Строка: oraoraora");
        System.out.println(processor.reverseString("oraoraora"));
    }
}
