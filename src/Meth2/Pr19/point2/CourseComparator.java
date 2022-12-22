package Meth2.Pr19.point2;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second){
        return first.getYear() - second.getYear();
    }
}