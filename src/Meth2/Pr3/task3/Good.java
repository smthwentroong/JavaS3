package Meth2.Pr3.task3;

public class Good {
    double value;
    String currency;
    String name;
    Good(double value, String currency, String name) {
        this.value = value;
        this.currency = currency;
        this.name = name;
    }
    public String toString() {

        return name + ": " + value + " " + currency;
    }
}
