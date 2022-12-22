package Meth2.Pr19.point2;

import java.util.Comparator;

public class SpecialityComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second){
        return first.getSpec().compareTo(second.getSpec());
    }
}
