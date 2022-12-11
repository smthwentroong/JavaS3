package Meth2.Pr11.point4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class DateNTimeFormer {
    public static void main(String[] args) {
        Date date = new Date();

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите год");
        date.setYear(scn.nextInt() - 1900);
        System.out.println("Введите месяц");
        date.setMonth(scn.nextInt() - 1);
        System.out.println("Введите число");
        date.setDate(scn.nextInt());
        System.out.println("Введите который час");
        date.setHours(scn.nextInt());
        System.out.println("Введите минуты");
        date.setMinutes(scn.nextInt());

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm");
        System.out.println("Сформированная дата: " + dateFormatter.format(date));

        Calendar userCalendar = Calendar.getInstance();


        System.out.println("Введите год");
        userCalendar.set(Calendar.YEAR, scn.nextInt());
        System.out.println("Введите месяц");
        userCalendar.set(Calendar.MONTH,scn.nextInt() - 1);
        System.out.println("Введите число");
        userCalendar.set(Calendar.DAY_OF_MONTH, scn.nextInt());
        System.out.println("Введите который час");
        userCalendar.set(Calendar.HOUR,scn.nextInt() - 12);
        System.out.println("Введите минуты");
        userCalendar.set(Calendar.MINUTE,scn.nextInt());

        SimpleDateFormat calendarFormatter = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm");
        System.out.println("Сформированный календарь: " + calendarFormatter.format(userCalendar.getTime()));

    }
}