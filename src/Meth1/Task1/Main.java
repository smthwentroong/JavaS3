package Meth1.Task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Про машины");
        Car car1 = new Car("Ladaaaa", 2017, "Vestaaaa");
        Car car2 = new Car(2021, "LaFerrari");
        Car car3 = new Car("Berlinetta");
        Car car4 = new Car();

        car1.setModel("Granta");
        System.out.println(car1);
        car1.Info();
        car2.Info();
        car3.Info();
        car4.Info();

        System.out.println("Про студентов");
        Student st1 = new Student(2, "Artem");
        Student st2 = new Student(4);
        Student st3 = new Student();

        st1.setYear(3);
        System.out.println(st1);
        st1.yearsLeft();
        st2.yearsLeft();
        st3.yearsLeft();

        System.out.println("Про преподавателей");
        Tutor t1 = new Tutor("Evgeniy", "OOP", "");
        Tutor t2 = new Tutor("Maths", "Geometry");
        Tutor t3 = new Tutor("Server-administration");
        Tutor t4 = new Tutor();

        t1.setSubject2("Course Work");
        System.out.println(t1);
        t1.otherSubjects();
        t2.otherSubjects();
        t3.otherSubjects();
        t4.otherSubjects();

    }
}
