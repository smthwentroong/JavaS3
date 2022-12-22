package Meth1.Task1;

public class Tutor {
    private String subject;
    private String subject2;
    private String name;

    public Tutor(String n, String s, String s2) {
        name = n;
        subject = s;
        subject2 = s2;
    }
    public Tutor(String s, String s2) {
        name = "Stepan";
        subject = s;
        subject2 = s2;
    }
    public Tutor(String s2) {
        subject2 = s2;
        name = "Stepan";
        subject = "JavaCore";
    }
    public Tutor() {
        subject = "Back-end";
        name = "Stepan";
        subject2 = "JavaCore";
    }

    public void setSubject(String s) {
        this.subject = s;
    }
    public void setSubject2(String s) {
        this.subject2 = s;
    }
    public void setName(String n) {
        this.name = n;
    }

    public String getSubject() {
        return subject;
    }
    public String getName() {
        return name;
    }
    public String getSubject2() {
        return subject2;
    }

    public String toString() {
        return this.name + " - " + this.subject + " tutor";
    }

    public void otherSubjects() {
        System.out.println(this.name + " is also a " + this.subject2 + " tutor");
    }
}
