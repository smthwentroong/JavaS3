package Meth2.Pr9;

public class InsertionSort {
    public static void insertionSort(Student students[]) {
        for (int i = 1; i < students.length; i++) {
            Student temp = students[i];
            int j;
            for (j = i-1; j >=0 && students[j].compareTo(temp) < 0; j--) {
                students[j+1] = students[j];
            }
            students[j+1] = temp;
        }
    }
}
