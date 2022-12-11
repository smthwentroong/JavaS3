package Meth2.Pr6.point6_11.CompShop;

public enum ComputerMarks {
    Expensive("Дорого Богато"),
    NotCheap("Лучший ПК за свои деньги"),
    Cheap("Вы что бабушка?");

    private String name;
    ComputerMarks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ComputerMarks{" +
                "name='" + name + '\'' +
                '}';
    }
}