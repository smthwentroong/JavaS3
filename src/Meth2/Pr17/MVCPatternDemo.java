package Meth2.Pr17;

public class MVCPatternDemo {

    public static void main(String[] args) {
        StudentController controller = new StudentController(retreiveStudentFromDatabase());
        controller.updateView();
    }

    public static Student retreiveStudentFromDatabase(){
        Student tmp = new Student();
        tmp.setName("Андрей");
        tmp.setRollNo("FULLSTACK");
        return tmp;
    }
}
