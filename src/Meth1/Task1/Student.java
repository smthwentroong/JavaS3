package Meth1.Task1;

public class Student {
    private int year;
    private String name;

    public Student(int y, String n) {
        year = y;
        name = n;
    }
    public Student(int y) {
        year = y;
        name = "Stepan";
    }
    public Student() {
        year = 1;
        name = "Stepan";
    }

    public void setYear(int y) {
        this.year = y;
    }
    public void setName(String n) {
        this.name = n;
    }

    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " - " + this.year + " year student";
    }

    public void yearsLeft() {
        System.out.println(this.name + " - " + (5 - this.year) + " years of study left");
    }
}
