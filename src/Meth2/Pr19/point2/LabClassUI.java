package Meth2.Pr19.point2;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {
    ArrayList<Student> students;


    public LabClassUI(ArrayList<Student> students){
        super("Students table");
        setSize(600,600);

        this.students = students;

        JPanel panelMain = new JPanel(new FlowLayout());

        JButton btnAddStudent = new JButton("Добавить");
        JButton btnRemoveStudent = new JButton("Удалить");
        JButton btnFindStudent = new JButton("Найти");

        panelMain.add(btnAddStudent);
        panelMain.add(btnRemoveStudent);
        panelMain.add(btnFindStudent);

        Object[] headers = new String[] {"Имя", "Фамилия", "Специальность", "Курс", "Группа", "Результат GPA"};
        Object [][] arStudents = new String[students.size()][6];

        for(int i = 0; i < students.size(); i++){
            arStudents[i][0] = students.get(i).getName();
            arStudents[i][1] = students.get(i).getSurname();
            arStudents[i][2] = students.get(i).getSpec();
            arStudents[i][3] = Integer.toString(students.get(i).getYear());
            arStudents[i][4] = students.get(i).getGroup();
            arStudents[i][5] = students.get(i).getGPA().toString();
        }


        JTable tableStudents = new JTable( new DefaultTableModel(arStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = tableStudents.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);


        header.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count = e.getClickCount();
                if (count == 2){
                    if(header.getHeaderRect(2).contains(e.getX(), e.getY()))
                        sortStudents(new SpecialityComparator(),tableStudents);
                    if(header.getHeaderRect(3).contains(e.getX(), e.getY()))
                        sortStudents(new CourseComparator(), tableStudents);
                    if(header.getHeaderRect(4).contains(e.getX(), e.getY()))
                        sortStudents(new GroupComparator(), tableStudents);
                    if(header.getHeaderRect(5).contains(e.getX(), e.getY()))
                        sortStudents(new GPAComparator(), tableStudents);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


        btnAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    addStudent(tableStudents);
                }catch (IllegalArgumentException exception){
                    JOptionPane.showMessageDialog(panelMain, exception.getMessage());
                }
            }
        });

        btnRemoveStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeStudent(tableStudents);
            }
        });

        btnFindStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    findStudent();
                }catch (StudentNotFoundException ex){
                    JOptionPane.showMessageDialog(getContentPane(), ex.getMessage());
                }
            }
        });




        add(new JScrollPane(tableStudents), BorderLayout.CENTER);

        add(panelMain, BorderLayout.NORTH);

        setVisible(true);
    }


    private void sortStudents(Comparator<Student> comp, JTable tableStudents){
        Student temp;

        students.sort(comp);

        DefaultTableModel dtm = (DefaultTableModel) tableStudents.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student student = students.get(i);
            dtm.insertRow(i, new Object[]{student.getName(), student.getSurname(), student.getSpec(), student.getYear(), student.getGroup(), student.getGPA()});
        }
    }

    private void findStudent() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите искомую Фамилию");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getSurname().equals(s)){
                JOptionPane.showMessageDialog(this, "Student was found: "+ students.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException();
    }

    private void removeStudent(JTable studTable) {
        int c = studTable.getSelectedRowCount();
        if(c != 1) {
            JOptionPane.showMessageDialog(this, "Выберете ровно одну строку!");
            return;
        }
        c = studTable.getSelectedRow();
        students.remove(c);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.removeRow(c);

    }

    private void addStudent(JTable tableStudents) throws IllegalArgumentException {
        String name = JOptionPane.showInputDialog("Введите имя студента");
        String surname = JOptionPane.showInputDialog("Введите фаилию студента");
        String spec = JOptionPane.showInputDialog("Введите направление обучения");
        String group = JOptionPane.showInputDialog("Введите группу студента");

        String year = JOptionPane.showInputDialog("Введите год обучения");
        String GPA = JOptionPane.showInputDialog("Введите GPA студента");

        if (name.equals("") || surname.equals("") || spec.equals("") || group.equals("")) throw new EmptyStringException();

        int course;
        Double newGPA;

        try {

            course = Integer.parseInt(year);
            newGPA = Double.parseDouble(GPA);

        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Введенный формат не преобразуем");
        }

        students.add(new Student(name, surname, spec, course, group, newGPA, 0));

        DefaultTableModel dtm = (DefaultTableModel) tableStudents.getModel();

        dtm.addRow(new Object[]{name, surname, spec, course, group, newGPA});
    }

}
