package Meth2.Pr11.point1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {

    public static void main(String[] args) throws ParseException {
        TaskReport report = new TaskReport("Ivanov Ivan Ivanovich", (new SimpleDateFormat("dd.MM.yyyy")).parse("09.05.1945"));
        report.setEndDate(new Date());
        System.out.println(report);
    }
}