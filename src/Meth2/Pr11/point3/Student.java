package Meth2.Pr11.point3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable <Student> {
    private Integer idNumber;
    private Double GPA;

    private Date birthday;
    private SimpleDateFormat dateFormatter;

    public Student(Integer idNumber, Double GPA, String birthday, int dateFormat) throws ParseException {
        this.idNumber = idNumber;
        this.GPA = GPA;
        this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(birthday);
        if (dateFormat == 1) dateFormatter = new SimpleDateFormat("E, yyyy.MM.dd 'at' HH:mm:ss z");
        else if (dateFormat == 2) dateFormatter = new SimpleDateFormat("EEEE, yyyy, d, MMMM");
        else if (dateFormat == 3) dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    }

    @Override
    public int compareTo(Student student) {
        if (this.GPA.equals(student.GPA)) return 0;
        else return (int)(Math.ceil(this.GPA) - Math.ceil(student.GPA));
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber: " + idNumber +
                ", GPA: " + GPA +
                ", birthday: " + dateFormatter.format(birthday) +
                '}';
    }
}
