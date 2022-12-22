package Lera.Task3;

public enum Seasons {
    Зима("Холодное время года", -10),
    Весна("Теплое время года", 15),
    Лето("Жаркое время года", 30),
    Осень("Прохладное время года", 7);

    private double av_temp;
    private String desc;
    Seasons(String desc, double av_temp) {
        this.desc = desc;
        this.av_temp = av_temp;
    }

    @Override
    public String toString() {
        return name() + " - " + desc + ", средняя температура: " + av_temp + "C";
    }
}
