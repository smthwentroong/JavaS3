package Meth2.Pr9;

public class Student implements Comparable <Student> {
    private Integer idNumber;
    private Double GPA;

    public Student(Integer idNumber, Double GPA){
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student student) {
        if (this.GPA.equals(student.GPA)) return 0;
        else return (int)(Math.ceil(this.GPA) - Math.ceil(student.GPA));
    }

    public String toString() {
        return "Студент №" + idNumber + " - результат: " + GPA;
    }

}
