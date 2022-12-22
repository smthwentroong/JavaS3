package Meth1.Task1;

public class Car {
    private int year;
    private String brand;
    private String model;

    public Car(String b, int y, String m) {
        year = y;
        brand = b;
        model = m;
    }
    public Car(int y, String m) {
        year = y;
        brand = "Ferrari";
        model = m;
    }
    public Car(String m) {
        year = 2011;
        brand = "Ferrari";
        model = m;
    }
    public Car() {
        year = 2009;
        brand = "Ferrari";
        model = "Spider";
    }

    public void setYear(int y) {
        this.year = y;
    }
    public void setBrand(String b) {
        this.brand = b;
    }
    public void setModel(String m) {
        this.model = m;
    }

    public int getYear() {
        return year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel(String m) {
        return model;
    }

    public String toString() {
        return this.brand + " " + this.model + " " + this.year;
    }

    public void Info() {
        System.out.println(this.brand + " " + this.model + " " + this.year);
    }
}
