package Meth2.Pr3.task3;

import java.util.ArrayList;

public class Report {
    public static void generateReport(ArrayList<Employee> salary) {
        for (int i = 0; i < salary.size(); i++) {

            System.out.printf("Работник: %s - зарплата: %.3f\n",
                    salary.get(i).fullname, salary.get(i).salary);
        }
    }
}
