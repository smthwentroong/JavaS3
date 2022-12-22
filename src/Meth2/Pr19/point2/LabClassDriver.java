package Meth2.Pr19.point2;

import java.util.ArrayList;

public class LabClassDriver {
    public static void main(String[] args) {
    ArrayList<Student> alStudents = new ArrayList<>();
    alStudents.add(new Student("Nikita", "Khitrov", "BackendWebDev",3, "IKBO-21-21",4d, 0));
    alStudents.add(new Student("Marat", "Gadjiev", "Churka", 4, "IKBO-20-22", 5d, 0));
    new LabClassUI(alStudents);
}
}
