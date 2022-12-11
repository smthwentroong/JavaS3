package Meth1.Lab3;

public class TestDogs {
    public static void main(String[] args) {
        Dog d1 = new Khurtskhaar();
        Dog d2 = new York();

        d1.waf();
        d1.commands("Сидеть");

        d2.waf();
        d2.commands("Ко мне");
        d2.commands("Лежать");
    }
}
