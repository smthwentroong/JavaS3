package Meth1.Lab3;

public class Khurtskhaar extends Dog{

    public Khurtskhaar() {
        this.breed = "Khurtskhaar";
        this.taught = true;
    }
    @Override
    public String waf() {
        return "waf-waf";
    }

    @Override
    public boolean commands(String com) {
        System.out.println("Команда " + com + " выполнена!");
        return true;
    }
}
