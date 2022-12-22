package Meth2.Pr19.point2;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String spec;
    private int year;
    private String group;
    public Double GPA;
    public int compareBy;

    public Student(String name, String surname, String spec, int year, String group, Double GPA, int comp) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.year = year;
        this.group = group;
        this.GPA = GPA;
        this.compareBy = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Double getGPA() { return GPA; }

    @Override
    public int compareTo(Student st) {
        if (compareBy == 0) return (int)Math.ceil(this.GPA - st.GPA);
        else if(compareBy == 1) return this.year - st.year;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", surname='" + surname +
                ", spec='" + spec +
                ", year=" + year +
                ", group='" + group +
                ", GPA='" + GPA +
                '}';
    }


}
