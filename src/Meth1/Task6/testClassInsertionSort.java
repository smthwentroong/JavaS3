package Meth1.Task6;

public class testClassInsertionSort {

    Student[] StudentsList;

    public void fillStudentsList(int length){
        StudentsList = new Student[length];
        for(int i = 0 ; i < length; i++) StudentsList[i] = new Student((int)(Math.random() * 100));
    }

    public void insertionSortStudentsList(){

        for (int i = 1; i < StudentsList.length; i++) {
            Student tmp = StudentsList[i];
            int j = i-1;
            while (j>=0 && StudentsList[j].compareTo(tmp) <= 0) {
                StudentsList[j + 1] = StudentsList[j];
                j -=1;
            }
            StudentsList[j + 1] = tmp;
        }

    }

}
