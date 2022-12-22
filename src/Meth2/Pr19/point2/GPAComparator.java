package Meth2.Pr19.point2;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second){
        return Double.compare(first.getGPA(),second.getGPA());
    }
}
