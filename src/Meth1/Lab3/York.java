package Meth1.Lab3;

public class York extends Dog {

    public York() {
        this.breed = "York-terier";
        this.taught = false;
    }

    @Override
    public String waf() {
        return "Woof-woof";
    }

    @Override
    public boolean commands(String com) {
        if (com == "Ко мне" || com == "Молчать") {
            System.out.println("Команда " + com + " исполнена!");
        }
        else System.out.println("Команда " + com + " не исполнена!");
        return false;
    }
}
